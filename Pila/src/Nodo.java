public class Nodo <T> {
    private T o;
    private Nodo siguiente;

    public Nodo(T element)
    {
        this.o = element;
        this.siguiente = null;
    }

    public Nodo()
    {
        this.o = null;
        this.siguiente = null;
    }

    public void setSiguiente(Nodo siguiente)
    {
        this.siguiente = siguiente;
    }

    public T getElemento()
    {
        return this.o;
    }

    public Nodo getSiguiente()
    {
        return this.siguiente;
    }

    @Override
    public String toString() {
        return this.o.toString() + ", siguiente =" +this.siguiente;
    }
}
