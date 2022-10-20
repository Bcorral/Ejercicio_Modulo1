public class GPS {

    public String coordenada_X;
    public String coordenada_Y;
    public String fecha;
    public String hora;
    public int diasTripulados;

    public GPS() {
    }

    public GPS(String coordenada_X, String coordenada_Y, String fecha, String hora, int diasTripulados ) {

        this.coordenada_X = coordenada_X;
        this.coordenada_Y = coordenada_Y;
        this.fecha=fecha;
        this.hora=hora;
        this.diasTripulados=diasTripulados;
    }

    public String getCoordenada_X() {
        return coordenada_X;
    }

    public void setCoordenada_X(String coordenada_X) {
        this.coordenada_X = coordenada_X;
    }

    public String getCoordenada_Y() {
        return coordenada_Y;
    }

    public void setCoordenada_Y(String coordenada_Y) {
        this.coordenada_Y = coordenada_Y;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getDiasTripulados() {
        return diasTripulados;
    }

    public void setDiasTripulados(int diasTripulados) {
        this.diasTripulados = diasTripulados;
    }


}
