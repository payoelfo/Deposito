package cuentas;

public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta() {
    }

    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo;  // Se añadió la asignación de tipoInterés
    }

    public double estado() {
        return saldo;
    }

public void ingresar(double cantidad) throws Exception {
    if (cantidad < 0) {
        throw new Exception("No se puede ingresar una cantidad negativa");
    }
    System.out.println("Ingresando " + cantidad + " en la cuenta...");
    saldo = saldo + cantidad;
    System.out.println("Ingreso exitoso. Nuevo saldo: " + saldo);
}


 public void retirar(double cantidad) throws Exception {
    if (cantidad <= 0) {
        throw new Exception("No se puede retirar una cantidad negativa");
    }
    if (estado() < cantidad) {
        throw new Exception("No hay suficiente saldo");
    }
    System.out.println("Retirando " + cantidad + " de la cuenta...");
    saldo = saldo - cantidad;
    System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
}

    // Métodos Getter y Setter
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCuenta() { return cuenta; }
    public void setCuenta(String cuenta) { this.cuenta = cuenta; }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    public double getTipoInteres() { return tipoInterés; }
    public void setTipoInteres(double tipoInteres) { this.tipoInterés = tipoInteres; }
}
