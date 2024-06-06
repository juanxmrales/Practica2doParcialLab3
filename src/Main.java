import Clases.Pasajero;
import Clases.Reserva;
import Clases.Vuelo;
import Genericos.GestorGenerico;
import Clases.Gestores.GestorPasajero;

public class Main {
    public static void main(String[] args) {

        GestorPasajero gestorPasajeros = new GestorPasajero();
        GestorGenerico<Vuelo> gestorVuelos = new GestorGenerico<>();
        GestorGenerico<Reserva> gestorReservas = new GestorGenerico<>();
        Pasajero pasajero1 = new Pasajero("Juan Perez", "123456");
        Pasajero pasajero2 = new Pasajero("Maria Lopez", "654321");
        Pasajero pasajero3 = new Pasajero("Pedro Martinez", "987654");
        Vuelo vuelo1 = new Vuelo("AR123", "Buenos Aires", "10:00", Vuelo.estado.DESPEGADO, Vuelo.tipoVuelo.NACIONAL);
        Vuelo vuelo2 = new Vuelo("AR456", "Madrid", "15:00", Vuelo.estado.PROGRAMADO, Vuelo.tipoVuelo.INTERNACIONAL);
        Vuelo vuelo3 = new Vuelo("AR789", "Miami", "20:00", Vuelo.estado.RETRASADO, Vuelo.tipoVuelo.INTERNACIONAL);
        Reserva reserva1 = new Reserva(pasajero1, vuelo1, Reserva.claseAsiento.PRIMERA);
        Reserva reserva2 = new Reserva(pasajero2, vuelo2, Reserva.claseAsiento.NEGOCIOS);
        Reserva reserva3 = new Reserva(pasajero3, vuelo3, Reserva.claseAsiento.ECONOMICA);

        gestorPasajeros.agregar(pasajero1);
        gestorPasajeros.agregar(pasajero2);
        gestorPasajeros.agregar(pasajero1);
        gestorPasajeros.agregar(pasajero2);
        System.out.println(gestorPasajeros.listar());

        //System.out.println(gestorPasajeros.listar());
        //gestorPasajeros.eliminar("123456");
        //System.out.println(gestorPasajeros.listar());













    }
}