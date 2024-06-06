package Clases;
import Genericos.Interfaces.Buscable;

public class Reserva implements Buscable {


    public enum claseAsiento{ECONOMICA, NEGOCIOS, PRIMERA};

    private static int autoID = 0;
    private Integer id;
    private Pasajero pasajero;
    private Vuelo vuelo;
    private claseAsiento claseAsiento;

    ///--------------------------INICIO CONSTRUCTORES--------------------------///

    public Reserva() {
        this.id = autoID;
        autoID ++;
    }

    public Reserva(Pasajero pasajero, Vuelo vuelo, claseAsiento claseAsiento) {
        this.id = autoID;
        autoID ++;
        this.pasajero = pasajero;
        this.vuelo = vuelo;
        this.claseAsiento = claseAsiento;
    }

    ///--------------------------FIN CONSTRUCTORES--------------------------///

    ///--------------------------INICIO GETTERS Y SETTERS--------------------------///



    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        vuelo = vuelo;
    }

    public Reserva.claseAsiento getClaseAsiento() {
        return claseAsiento;
    }

    public void setClaseAsiento(Reserva.claseAsiento claseAsiento) {
        this.claseAsiento = claseAsiento;
    }


    ///--------------------------FIN GETTERS Y SETTERS--------------------------///


    @Override
    public String toString() {
        return "Clases.Reserva{" +
                "id=" + id +
                ", Clases.Pasajero='" + pasajero.toString() + '\'' +
                ", Clases.Vuelo='" + vuelo.toString() + '\'' +
                ", claseAsiento=" + claseAsiento +
                '}';
    }


    @Override
    public Object buscar() {
    return this.id;
    }



}
