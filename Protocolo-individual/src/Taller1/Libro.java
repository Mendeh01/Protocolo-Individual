package Taller1;

public class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;


    public Libro() {
        this.titulo = "Desconocido";
        this.autor = "Anónimo";
        this.numeroPaginas = 0;
    }


    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }


    public void mostrarDetalles() {
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", Páginas: " + numeroPaginas);
    }

    @Override
    public String toString() {
        return "Libro [Título=" + titulo + ", Autor=" + autor + ", Páginas=" + numeroPaginas + "]";
    }
}
