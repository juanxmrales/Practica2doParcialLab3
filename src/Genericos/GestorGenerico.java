package Genericos;
import Genericos.Interfaces.Buscable;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GestorGenerico<T extends Buscable<B>, B>{

    private Set<T> conjunto;

    public GestorGenerico() {
        this.conjunto = new HashSet<>();
    }

    public void agregar(T elemento) {
        conjunto.add(elemento);
    }

    public void eliminar(B id) {
        conjunto.removeIf(elemento -> elemento.getId().equals(id));
    }

    public T buscar(B id) {
        for (T elemento : conjunto) {
            if (elemento.getId().equals(id)) {
                return elemento;
            }
        }
        return null;
    }


}
