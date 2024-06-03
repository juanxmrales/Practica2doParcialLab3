import Clases.Pasajero;
import Clases.Reserva;
import Clases.Vuelo;

public class Main {
    public static void main(String[] args) {


       Vuelo vuelo = new Vuelo("123", "Buenos Aires", "12:00", Vuelo.estado.DESPEGADO, Vuelo.tipoVuelo.NACIONAL);
       Pasajero pasajero = new Pasajero("Juan Cruz", "12345678");
       Reserva reserva = new Reserva(pasajero, vuelo, Reserva.claseAsiento.PRIMERA);
       System.out.println(reserva);




    }
}