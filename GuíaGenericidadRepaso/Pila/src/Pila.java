import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Pila {
    private List<Nodo> nodos;

    public Pila(){
        this.nodos = new LinkedList<Nodo>();
    }

    private Nodo ultimoNodoIngresado()
    {
        Nodo rta = null;

        if(!nodos.isEmpty())
        {
            rta = this.nodos.get(this.nodos.size()-1);
        }

        return rta;
    }

    public String ultimoElementoIngresado(){
        String rta = new String();

        if (!nodos.isEmpty()){
            Nodo n = this.ultimoNodoIngresado();
            rta = n.toString();
        }

        return rta;
    }

    public Object pop()
    {
        Object rta = null;

        Nodo n = ultimoNodoIngresado();

        if(n != null){
            rta = n.getElemento();
            nodos.remove(this.nodos.size()-1);

            Nodo nuevoUltimo = ultimoNodoIngresado();
            nuevoUltimo.setSiguiente(null);

            this.sobreescribirUltimo(nuevoUltimo);
        }

        return rta;
    }

    private boolean sobreescribirUltimo(Nodo n)
    {
        boolean rta = nodos.remove(this.ultimoNodoIngresado());
        if(rta) {
            nodos.add(n);
        }
        return rta;
    }

    public void push(Object o)
    {
        Nodo nuevo = new Nodo(o);

        if(!nodos.isEmpty()){
            Nodo anterior = this.ultimoNodoIngresado();

            anterior.setSiguiente(nuevo);

            sobreescribirUltimo(anterior);
        }

        nodos.add(nuevo);
    }

    public int size()
    {
        return this.nodos.size();
    }
}
