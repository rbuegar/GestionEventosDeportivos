package classes;

import classes.Participante;

public class ParticipanteCarrera extends Participante {
    private double tiempo;

    // Constructor que recibe todos los atributos e inicializa los valores
    public ParticipanteCarrera(String dni, String nombre, String apellidos, int edad, double tiempo) {
        super(dni, nombre, apellidos, edad);
        this.tiempo = tiempo;
    }

    // Getter y setter para el atributo tiempo
    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    // Método toString() que devuelve una cadena con la información del participante de la carrera
    @Override
    public String toString() {
        return "classes.ParticipanteCarrera{" +
                "dni='" + getDni() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", apellidos='" + getApellidos() + '\'' +
                ", edad=" + getEdad() +
                ", tiempo=" + tiempo +
                '}';
    }
}

