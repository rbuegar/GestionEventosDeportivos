package classes;

import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class EventoDeportivo {
    // Atributos
    private String nombre;
    private LocalDateTime fecha;
    private String lugar;
    private ArrayList<Participante> participantes;

    // Constructor
    public EventoDeportivo(String nombre, LocalDateTime fecha, String lugar) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.participantes = new ArrayList<>();
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    // Método para inscribir un participante
    public boolean inscribirParticipante(Participante participante) {
        return participantes.add(participante);
    }

    // Método abstracto para obtener el ganador
    public abstract ArrayList<Participante> obtenerGanador();
}
