package Clases;

import Genericos.Interfaces.Buscable;

public class Vuelo implements Buscable{

    public enum estado{PROGRAMADO, RETRASADO, CANCELADO, DESPEGADO} //Se crea un enum para que los estados solo puedan ser estos cuatro
    public enum tipoVuelo{INTERNACIONAL, NACIONAL} //Se crea un enum para que los tipos de vuelo solo puedan ser estos dos

    private String codigoVuelo;
    private String destino;
    private String hrSalida;
    private estado estado;
    private tipoVuelo tipoVuelo;

    ///--------------------------INICIO CONSTRUCTORES--------------------------///

    public Vuelo() {
    }

    public Vuelo(String codigoVuelo, String destino, String hrSalida, estado estado, tipoVuelo tipoVuelo) {
        this.codigoVuelo = codigoVuelo;
        this.destino = destino;
        this.hrSalida = hrSalida;
        this.estado = estado;
        this.tipoVuelo = tipoVuelo;
    }

    ///--------------------------FIN CONSTRUCTORES--------------------------///

    ///--------------------------INICIO GETTERS Y SETTERS--------------------------///


    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public void setCodigoVuelo(String codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getHrSalida() {
        return hrSalida;
    }

    public void setHrSalida(String hrSalida) {
        this.hrSalida = hrSalida;
    }

    public Vuelo.estado getEstado() {
        return estado;
    }

    public void setEstado(Vuelo.estado estado) {
        this.estado = estado;
    }

    public Vuelo.tipoVuelo getTipoVuelo() {
        return tipoVuelo;
    }

    public void setTipoVuelo(Vuelo.tipoVuelo tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }

    ///--------------------------FIN GETTERS Y SETTERS--------------------------///


    @Override
    public String toString() {
        return "Clases.Vuelo{" +
                "codigoVuelo='" + codigoVuelo + '\'' +
                ", destino='" + destino + '\'' +
                ", hrSalida='" + hrSalida + '\'' +
                ", estado=" + estado +
                ", tipoVuelo=" + tipoVuelo +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Vuelo vuelo = (Vuelo) obj;
        return codigoVuelo.equals(vuelo.codigoVuelo);
    }

    @Override
    public Object buscar() {
        return this.destino;
    }
}
