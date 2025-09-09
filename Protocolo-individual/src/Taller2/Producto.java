package Taller2;

public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;   // diferencia atributo vs parámetro
        this.precio = precio;
    }

    public void mostrarProducto() {
        System.out.println("Producto: " + this.nombre + ", Precio: $" + this.precio);
    }

    @Override
    public String toString() {
        return "Producto [Nombre=" + nombre + ", Precio=" + precio + "]";
    }
}

