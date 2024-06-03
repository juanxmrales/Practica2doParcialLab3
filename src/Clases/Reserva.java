package Clases;

public class Reserva {

    public enum claseAsiento{ECONOMICA, NEGOCIOS, PRIMERA};

    private static long autoID = 0;
    private long id;
    private Pasajero pasajero;
    private Vuelo Vuelo;
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
        this.Vuelo = vuelo;
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
        return Vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        Vuelo = vuelo;
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
                ", Clases.Pasajero='" + pasajero.getNombreCompleto() + '\'' +
                ", Clases.Vuelo='" + getVuelo().getCodigoVuelo() + '\'' +
                ", claseAsiento=" + claseAsiento +
                '}';
    }
}
