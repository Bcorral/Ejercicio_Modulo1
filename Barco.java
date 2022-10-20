public class Barco {
    public String nombre;
    public String tipo;
    public int capacidadPasajero;
    public int capacidadCarga;
    public Barco() {
    }

    public Barco(String nombre, String tipo, int capacidadPasajero, int capacidadCarga ) {

        this.name = nombre;
        this.tipo = tipo;
        this.capacidadPasajero=capacidadPasajero;
        this.capacidadCarga=capacidadCarga;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidadPasajero() {
        return capacidadPasajero;
    }

    public void setCapacidadPasajero(int capacidadPasajero) {
        this.capacidadPasajero = capacidadPasajero;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    void mostrarDatos() {
        System.out.println("Nombre: " + name);
        System.out.println("Apellido: " + tipo);
        System.out.println("Capacidad de pasajeros: " + capacidadPasajero);
        System.out.println("Capacidad de carga: " + capacidadCarga);
    }
}

}
