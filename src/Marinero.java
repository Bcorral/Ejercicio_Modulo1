public class Marinero extends Tripulante{

    protected int pesoTotalPescado;
    protected static final float sueldo = 90000;
    protected float sueldo_total;
    protected float bono;

    public Marinero(){
        super();
    }
    public Marinero(int numeroCarnet, int edad, int tiempo_en_la_empresa, String nombre, String telefono, char sexo, Barco barco, int pesoTotalPescado) {
        super(numeroCarnet, edad, tiempo_en_la_empresa, nombre, telefono, sexo, barco);
        this.pesoTotalPescado = pesoTotalPescado;

    }
    public Marinero(int numeroCarnet, int edad, int tiempo_en_la_empresa, String nombre, String telefono, char sexo, Barco barco, int pesoTotalPescado, float sueldo_total, float bono) {
        super(numeroCarnet, edad, tiempo_en_la_empresa, nombre, telefono, sexo, barco);
        this.pesoTotalPescado = pesoTotalPescado;
        this.sueldo_total = sueldo_total;
        this.bono = bono;
    }

    public int getPesoTotalPescado() {
        return pesoTotalPescado;
    }

    public void setPesoTotalPescado(int pesoTotalPescado) {
        this.pesoTotalPescado = pesoTotalPescado;
    }

    public float getSueldo_total() {
        return sueldo_total;
    }

    public void setSueldo_total(float sueldo_total) {
        this.sueldo_total = sueldo_total;
    }

    public float getBono() {
        return bono;
    }

    public void setBono(float bono) {
        this.bono = bono;
    }

    void bono() {

        if (pesoTotalPescado >= 1) {
            bono = 0.25f * sueldo;
            sueldo_total = sueldo + bono;
        } else{
            sueldo_total = sueldo;
        }


    }
}
