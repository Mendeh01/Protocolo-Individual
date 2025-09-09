package Taller1;

public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;


    public CuentaBancaria() {
        this.numeroCuenta = "000000";
        this.saldo = 0.0;
        this.tipoCuenta = "Ahorros";
    }


    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = 0.0;
    }


    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public void mostrarDetalles() {
        System.out.println("Cuenta: " + numeroCuenta + ", Tipo: " + tipoCuenta + ", Saldo: " + saldo);
    }

    @Override
    public String toString() {
        return "CuentaBancaria [Número=" + numeroCuenta + ", Saldo=" + saldo + ", Tipo=" + tipoCuenta + "]";
    }
}
