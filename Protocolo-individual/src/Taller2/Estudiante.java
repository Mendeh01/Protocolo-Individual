package Taller2;

public class Estudiante {
    private String nombre;
    private int edad;


    public Estudiante() {
        this("Sin nombre", 0);
    }

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDetalles() {
        System.out.println("Estudiante: " + this.nombre + ", Edad: " + this.edad);
    }

    @Override
    public String toString() {
        return "Estudiante [Nombre=" + nombre + ", Edad=" + edad + "]";
    }
}

