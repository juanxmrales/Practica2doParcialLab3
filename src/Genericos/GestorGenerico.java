package Genericos;
import Genericos.Interfaces.Buscable;

import java.util.HashSet;
import java.util.Set;

public class GestorGenerico<T extends Buscable>{

    private Set<T> items;

    public GestorGenerico() {
        this.items = new HashSet<>();
    }

    public void agregar(T elemento) {
        items.add(elemento);
    }

    public T buscar(Object elemento){
        return items.stream().filter(item->item.buscar().equals(elemento)).findFirst().orElse(null);
    }

    public T eliminar (Object elemento){
        T item = buscar(elemento);
        if(item != null){
            items.remove(item);
        }
        return item;
    }

    public Set<T> listar(){
        return items;
    }




}
