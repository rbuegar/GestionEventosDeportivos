import classes.*;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de eventos deportivos
        Carrera carrera = new Carrera("Carrera de 100 metros", LocalDateTime.now(), "Estadio Central", 100.0);
        TorneoDeFutbol torneo = new TorneoDeFutbol("Torneo de Fútbol", LocalDateTime.now(), "Estadio de la Ciudad");

        // Crear participantes para la carrera
        ParticipanteCarrera participante1 = new ParticipanteCarrera("12345678A", "Juan", "Pérez", 30, 360.0);
        ParticipanteCarrera participante2 = new ParticipanteCarrera("23456789B", "Ana", "López", 28, 350.0);

        // Inscribir participantes en la carrera
        carrera.inscribirParticipante(participante1);
        carrera.inscribirParticipante(participante2);

        // Crear equipos para el torneo de fútbol
        Equipo equipo1 = new Equipo("Equipo Rojo");
        Equipo equipo2 = new Equipo("Equipo Verde");

        // Inscribir equipos en el torneo de fútbol
        torneo.inscribirEquipo(equipo1);
        torneo.inscribirEquipo(equipo2);

        // Añadir jugadores a los equipos
        equipo1.añadirJugador(participante1);
        equipo2.añadirJugador(participante2);

        // Añadir y eliminar jugadores de equipos
        boolean añadido = equipo1.añadirJugador(new ParticipanteCarrera("34567890C", "Carlos", "García", 25, 340.0));
        if (añadido) {
            System.out.println("Jugador añadido correctamente.");
        } else {
            System.out.println("Error al añadir jugador.");
        }

        boolean eliminado = equipo1.eliminarJugador(participante1);
        if (eliminado) {
            System.out.println("Jugador eliminado correctamente.");
        } else {
            System.out.println("Error al eliminar jugador.");
        }

        // Mostrar información de eventos, participantes, equipos y jugadores
        System.out.println(carrera.toString());
        System.out.println(torneo.toString());
        System.out.println(equipo1.toString());
        System.out.println(equipo2.toString());

        // Determinar y mostrar el ganador de cada evento
        ArrayList<Participante> ganadoresCarrera = carrera.obtenerGanador();
        ArrayList<Participante> ganadoresTorneo = torneo.obtenerGanador();
        System.out.println("Ganadores de la carrera: " + ganadoresCarrera);
        System.out.println("Ganadores del torneo: " + ganadoresTorneo);

        // Mostrar la lista de equipos de mayor a menor puntuación
        // Suponiendo que hay un método para obtener los equipos ordenados por puntos
        ArrayList<Equipo> equiposOrdenados = TorneoDeFutbol.obtenerEquiposOrdenadosPorPuntos;
        System.out.println("Equipos ordenados por puntos: " + equiposOrdenados);
    }
}

