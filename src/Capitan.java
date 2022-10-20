public class Capitan extends Tripulante {

    protected int horas_de_experticia;
    protected static final float sueldo = 4500000;
    protected float sueldo_total;
    protected float bono;

    public Capitan(){
        super();
    }
    public Capitan(int numeroCarnet, int edad, int tiempo_en_la_empresa, String nombre, String telefono, char sexo, Barco barco, int horas_de_experticia) {
        super(numeroCarnet, edad, tiempo_en_la_empresa, nombre, telefono, sexo, barco);
        this.horas_de_experticia = horas_de_experticia;

    }
    public Capitan(int numeroCarnet, int edad, int tiempo_en_la_empresa, String nombre, String telefono, char sexo, Barco barco, int horas_de_experticia, float sueldo_total, float bono) {
        super(numeroCarnet, edad, tiempo_en_la_empresa, nombre, telefono, sexo, barco);
        this.horas_de_experticia = horas_de_experticia;
        this.sueldo_total = sueldo_total;
        this.bono = bono;
    }

    public int getHoras_de_experticia() {
        return horas_de_experticia;
    }

    public void setHoras_de_experticia(int horas_de_experticia) {
        this.horas_de_experticia = horas_de_experticia;
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

        if (150000 >= horas_de_experticia && horas_de_experticia >= 5000) {
            bono = 0.2f * sueldo;
            sueldo_total = sueldo + bono;
        } else if (300000 >= horas_de_experticia && horas_de_experticia >= 150000) {
            bono = 0.4f * sueldo;
            sueldo_total = sueldo + bono;
        }else if (horas_de_experticia <= 300000) {
            bono = 0.75f * sueldo;
            sueldo_total = sueldo + bono;

        }else{
            sueldo_total = sueldo;
        }


    }
}
