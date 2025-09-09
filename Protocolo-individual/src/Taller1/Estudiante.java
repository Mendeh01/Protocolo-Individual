package Taller1;

public class Estudiante {
    private String nombre;
    private int edad;
    private String curso;


    public Estudiante() {
        this("Sin nombre", 0, "Sin curso");
    }


    public Estudiante(String nombre, int edad) {
        this(nombre, edad, "Sin curso");
    }


    public Estudiante(String nombre, int edad, String curso) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Curso: " + curso);
    }

    @Override
    public String toString() {
        return "Estudiante [Nombre=" + nombre + ", Edad=" + edad + ", Curso=" + curso + "]";
    }
}
