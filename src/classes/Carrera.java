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
        ArrayList<Participante> ganadores = new ArrayList<>();
        double menorTiempo = Double.MAX_VALUE;
        for (Participante participante : getParticipantes()) {
            if (participante.getTiempo() < menorTiempo) {
                menorTiempo = participante.getTiempo();
                // Limpiar la lista de ganadores anteriores si encontramos un nuevo ganador con un tiempo menor
                ganadores.clear();
                // Agregar al participante como el nuevo ganador
                ganadores.add(participante);
            } else if (participante.getTiempo() == menorTiempo) {
                // Si hay empate en el tiempo, agregamos al participante también como ganador
                ganadores.add(participante);
            }
        }
        return ganadores;
    }
}
