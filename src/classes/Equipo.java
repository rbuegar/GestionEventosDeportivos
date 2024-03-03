package classes;

import java.util.ArrayList;

public class Equipo  implements Comparable<Equipo> {
    // Atributos
    private String nombre;
    private ArrayList<Participante> jugadores;
    private int puntos;

    // Constructor
    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
        this.puntos = 0;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Participante> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Participante> jugadores) {
        this.jugadores = jugadores;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    // Método para añadir un jugador al equipo
    public boolean añadirJugador(Participante jugador) {
        return jugadores.add(jugador);
    }

    // Método para eliminar un jugador del equipo por nombre y apellido
    public boolean eliminarJugador(Participante jugador) {
        return jugadores.remove(jugador);
    }

    // Método toString para mostrar información del equipo
    @Override
    public String toString() {
        return "Equipo: " + nombre + ", Jugadores: " + jugadores + ", Puntos: " + puntos;
    }

    // Método equals para comparar equipos por nombre
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Equipo equipo = (Equipo) obj;
        return nombre.equals(equipo.nombre);
    }

    // Método compareTo para comparar equipos por puntos
    @Override
    public int compareTo(Equipo equipo) {
        return Integer.compare(this.puntos, equipo.puntos);
    }
}
