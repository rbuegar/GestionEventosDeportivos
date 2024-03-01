package classes;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Carrera extends EventoDeportivo {
    // Atributos adicionales
    private double distancia;

    // Constructor
    public Carrera(String nombre, LocalDateTime fecha, String lugar, double distancia) {
        super(nombre, fecha, lugar);
        this.distancia = distancia;
    }

    // Método para obtener al ganador de la carrera
    @Override
    public ArrayList<Participante> obtenerGanador() {
        // Suponemos que cada participante tiene un atributo de tiempo registrado en segundos
        // Aquí encontraríamos al participante con el menor tiempo registrado
        // y lo devolveríamos como el ganador
        ArrayList<Participante> ganador = new ArrayList<>();
        Participante participanteGanador = null;
        double menorTiempo = Double.MAX_VALUE;
        for (Participante participante : getParticipantes()) {
            if (participante.getTiempoRegistrado() < menorTiempo) {
                menorTiempo = participante.getTiempoRegistrado();
                participanteGanador = participante;
            }
        }
        if (participanteGanador != null) {
            ganador.add(participanteGanador);
        }
        return ganador;
    }
}
