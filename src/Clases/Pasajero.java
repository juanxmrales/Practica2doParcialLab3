package Clases;

public class Pasajero {

    private String nombreCompleto;
    private String nroPasaporte;

    ///--------------------------INICIO CONSTRUCTORES--------------------------///

    public Pasajero() {
    }

    public Pasajero(String nombreCompleto, String nroPasaporte) {
        this.nombreCompleto = nombreCompleto;
        this.nroPasaporte = nroPasaporte;
    }

    ///--------------------------FIN CONSTRUCTORES--------------------------///

    ///--------------------------INICIO GETTERS Y SETTERS--------------------------///


    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNroPasaporte() {
        return nroPasaporte;
    }

    public void setNroPasaporte(String nroPasaporte) {
        this.nroPasaporte = nroPasaporte;
    }

    ///--------------------------FIN GETTERS Y SETTERS--------------------------///

    @Override
    public String toString() {
        return "Clases.Pasajero{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", nroPasaporte='" + nroPasaporte + '\'' +
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
        Pasajero pasajero = (Pasajero) obj;
        return nroPasaporte.equals(pasajero.nroPasaporte);
    }


}
