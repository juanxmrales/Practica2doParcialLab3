package Clases.Gestores;
import Clases.Pasajero;
import Excepciones.PasajeroExistenteException;
import Genericos.GestorGenerico;

import com.sun.source.tree.UsesTree;

import java.util.Set;

public class GestorPasajero extends GestorGenerico<Pasajero> {

    private Set<Pasajero> pasajeros;

    @Override
    public void agregar(Pasajero pasajero) {
        try {
            if (super.buscar(pasajero.buscar()) != null)
                throw new PasajeroExistenteException("El pasajero ya existe");
            else
                super.agregar(pasajero);
        } catch (PasajeroExistenteException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Pasajero buscar(Object nroPasaporte) {
        return super.buscar(nroPasaporte);
    }

    public Pasajero eliminar(Object id) {
        Pasajero pasajero = buscar(id);
        if (pasajero != null) {
            super.listar().remove(pasajero);
        }
        return pasajero;
    }
}
