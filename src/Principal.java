
import java.util.ArrayList;
public class Principal {
    public static void main(String[] args) {

        ArrayList<Marinero> marinero = new ArrayList<Marinero>();
        Barco barco1 = new Barco("Queen","Crucero",300,100);
        barco1.mostrarDatos();
        GPS gps1 = new GPS(15,20,"22/10/2022","10:37:00",300);
        Capitan capitan = new Capitan(123,28,5,"Antonio Cano","952000000","M",barco1,100);
        Jefe_de_Flota jefe_de_flota = new Jefe_de_Flota(124,34,7,"Juan Gonzalez","H",barco1,10,15);
        System.out.println("Hello world!");
    }
}