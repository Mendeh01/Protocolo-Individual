package Taller1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Libro libroDefecto = new Libro();
        CuentaBancaria cuentaDefecto = new CuentaBancaria();
        Estudiante estudianteDefecto = new Estudiante();


        System.out.print("Ingrese título del libro: ");
        String titulo = sc.nextLine();
        System.out.print("Ingrese autor del libro: ");
        String autor = sc.nextLine();
        System.out.print("Ingrese número de páginas: ");
        int paginas = sc.nextInt();
        sc.nextLine();
        Libro libroParam = new Libro(titulo, autor, paginas);

        System.out.print("Ingrese número de cuenta: ");
        String numCuenta = sc.nextLine();
        System.out.print("Ingrese tipo de cuenta: ");
        String tipoCuenta = sc.nextLine();
        System.out.print("Ingrese saldo inicial: ");
        double saldo = sc.nextDouble();
        sc.nextLine();
        CuentaBancaria cuentaParam = new CuentaBancaria(numCuenta, saldo, tipoCuenta);

        System.out.print("Ingrese nombre del estudiante: ");
        String nombreEst = sc.nextLine();
        System.out.print("Ingrese edad del estudiante: ");
        int edadEst = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingrese curso del estudiante: ");
        String cursoEst = sc.nextLine();
        Estudiante estudianteParam = new Estudiante(nombreEst, edadEst, cursoEst);


        System.out.println("\n=== Objetos creados ===");
        System.out.println(libroDefecto);
        System.out.println(libroParam);
        System.out.println(cuentaDefecto);
        System.out.println(cuentaParam);
        System.out.println(estudianteDefecto);
        System.out.println(estudianteParam);

        sc.close();
    }
}

