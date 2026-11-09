public class Auto {
    String marca;
    String modelo;
    boolean encendido = false; // Estado inicial por defecto

    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void encender() {
        this.encendido = true;
        System.out.println("El vehículo " + marca + " " + modelo + " se ha encendido.");
    }

    public void apagar() {
        this.encendido = false;
        System.out.println("El vehículo " + marca + " " + modelo + " se ha apagado.");
    }

    public void mostrarEstado() {
        if (this.encendido) {
            System.out.println("Estado actual del vehículo: ENCENDIDO");
        } else {
            System.out.println("Estado actual del vehículo: APAGADO");
        }
    }

    public static void main(String[] args) {
        Auto miAuto = new Auto("Toyota", "Corolla");

        System.out.println("--- Simulación de Auto ---");
        miAuto.mostrarEstado();
        miAuto.encender();
        miAuto.mostrarEstado();
        miAuto.apagar();
        miAuto.mostrarEstado();
    }
}