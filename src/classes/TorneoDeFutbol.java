package classes;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class TorneoDeFutbol  extends EventoDeportivo {
    // Atributo adicional
    private ArrayList<Equipo> equipos;

    // Constructor
    public TorneoDeFutbol(String nombre, LocalDateTime fecha, String lugar) {
        super(nombre, fecha, lugar);
        this.equipos = new ArrayList<>();
    }

    // Método para obtener al ganador del torneo de fútbol
    @Override
    public ArrayList<Participante> obtenerGanador() {
        // Suponemos que cada equipo tiene un atributo de puntos acumulados
        // Aquí encontraríamos al equipo con la mayor cantidad de puntos
        // y devolveríamos los participantes de ese equipo como ganadores
        ArrayList<Participante> ganadores = new ArrayList<>();
        int maxPuntos = 0;
        for (Equipo equipo : equipos) {
            if (equipo.getPuntosAcumulados() > maxPuntos) {
                maxPuntos = equipo.getPuntosAcumulados();
                ganadores.clear();
                ganadores.addAll(equipo.getJugadores());
            }
        }
        return ganadores;
    }

    // Método para inscribir un equipo en el torneo
    public boolean inscribirEquipo(Equipo equipo) {
        if (!equipos.contains(equipo)) {
            equipos.add(equipo);
            return true;
        }
        return false;
    }
}
