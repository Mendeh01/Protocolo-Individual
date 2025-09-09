package Taller2;

/*
||--Uso incorrecto--||
||--no se puede usar this en un contexto estático--||

public class Persona {
    private String nombre;

    public static void mostrarNombre() {

        System.out.println(this.nombre);
    }
}
*/
public class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarNombre() {
        System.out.println("Nombre: " + this.nombre);
    }

    public static void mostrarNombreEstatico(Persona persona) {
        System.out.println("Nombre: " + persona.nombre);
    }
}

