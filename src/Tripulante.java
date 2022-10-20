public abstract class Tripulante {

    protected int numeroCarnet;
    protected int edad;
    protected int tiempo_en_la_empresa;
    protected String nombre;
    protected String telefono;
    protected char sexo;
    protected Barco barco;

    public Tripulante(){}
    public Tripulante(int numeroCarnet, int edad, int tiempo_en_la_empresa, String nombre, String telefono, char sexo, Barco barco) {
        this.numeroCarnet = numeroCarnet;
        this.edad = edad;
        this.tiempo_en_la_empresa = tiempo_en_la_empresa;
        this.nombre = nombre;
        this.telefono = telefono;
        this.sexo = sexo;
        this.barco = barco;
    }

    public int getNumeroCarnet() {
        return numeroCarnet;
    }

    public void setNumeroCarnet(int numeroCarnet) {
        this.numeroCarnet = numeroCarnet;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTiempo_en_la_empresa() {
        return tiempo_en_la_empresa;
    }

    public void setTiempo_en_la_empresa(int tiempo_en_la_empresa) {
        this.tiempo_en_la_empresa = tiempo_en_la_empresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }


    public abstract void sueldo();
    public abstract void mostrar_datos();
}
