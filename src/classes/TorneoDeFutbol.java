package classes;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class TorneoDeFutbol extends EventoDeportivo {
    public static ArrayList<Equipo> obtenerEquiposOrdenadosPorPuntos;
    private ArrayList<Equipo> equipos;

    public TorneoDeFutbol(String nombre, LocalDateTime fecha, String lugar) {
        super(nombre, fecha, lugar);
        this.equipos = new ArrayList<>();
    }

    public boolean inscribirEquipo(Equipo equipo) {
        if (!equipos.contains(equipo)) {
            equipos.add(equipo);
            return true;
        }
        return false;
    }

    @Override
    public ArrayList<Participante> obtenerGanador() {
        if (equipos.isEmpty()) {
            return new ArrayList<>(); // Retorna una lista vacía si no hay equipos inscritos
        }

        // Suponiendo que todos los equipos tienen al menos un jugador
        equipos.sort(null); // Ordena los equipos por puntos, asumiendo que Equipo implementa Comparable
        return equipos.get(0).getJugadores(); // Devuelve los jugadores del equipo con más puntos
    }

    // Método para obtener los equipos ordenados por puntos
    public ArrayList<Equipo> obtenerEquiposOrdenadosPorPuntos() {
        ArrayList<Equipo> equiposOrdenados = new ArrayList<>(equipos);
        equiposOrdenados.sort(null); // Ordena los equipos por puntos
        return equiposOrdenados;
    }
}
