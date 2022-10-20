public class Jefe_de_Flota extends Tripulante{

    protected int pesoPescado;
    protected int pesoMariscos;
    protected static final float sueldo = 350000000;
    protected float sueldo_total;
    protected float bonoPescado;
    protected float bonoMariscos;

    public Jefe_de_Flota(){
        super();
    }
    public Jefe_de_Flota(int numeroCarnet, int edad, int tiempo_en_la_empresa, String nombre, String telefono, char sexo, Barco barco, int pesoPescado, int pesoMariscos) {
        super(numeroCarnet, edad, tiempo_en_la_empresa, nombre, telefono, sexo, barco);
        this.pesoPescado = pesoPescado;
        this.pesoMariscos = pesoMariscos;

    }
    public Jefe_de_Flota(int numeroCarnet, int edad, int tiempo_en_la_empresa, String nombre, String telefono, char sexo, Barco barco, int pesoPescado, int pesoMariscos, float sueldo_total, float bonoPescado, float bonoMariscos) {
        super(numeroCarnet, edad, tiempo_en_la_empresa, nombre, telefono, sexo, barco);
        this.pesoPescado = pesoPescado;
        this.pesoMariscos = pesoMariscos;
        this.sueldo_total = sueldo_total;
        this.bonoPescado = bonoPescado;
        this.bonoMariscos = bonoMariscos;
    }

    public int getPesoPescado() {
        return pesoPescado;
    }

    public void setPesoPescado(int pesoPescado) {
        this.pesoPescado = pesoPescado;
    }

    public int getPesoMariscos() {
        return pesoMariscos;
    }

    public void setPesoMariscos(int pesoMariscos) {
        this.pesoMariscos = pesoMariscos;
    }

    public float getSueldo_total() {
        return sueldo_total;
    }

    public void setSueldo_total(float sueldo_total) {
        this.sueldo_total = sueldo_total;
    }

    public float getBonoPescado() {
        return bonoPescado;
    }

    public void setBonoPescado(float bonoPescado) {
        this.bonoPescado = bonoPescado;
    }

    public float getBonoMariscos() {
        return bonoMariscos;
    }

    public void setBonoMariscos(float bonoMariscos) {
        this.bonoMariscos = bonoMariscos;
    }

    void bono() {

        if (pesoPescado > 0) {
            bono = pesoPescado * sueldo;
            sueldo_total = sueldo + bono;
        } else if (pesoMariscos > 0) {
            bono = pesoMariscos * sueldo;
            sueldo_total = sueldo + bono;
        }else{
            sueldo_total = sueldo;
        }


    }

}
