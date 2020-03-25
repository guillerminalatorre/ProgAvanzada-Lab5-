import java.util.Scanner;
public class Main{

    public static void main(String[] args) {

        Animal a = new Animal("Perro");
        Animal b = new Animal("Gato");

        Person c = new Person ("Pepe", 12, "plko");
        Person d = new Person ("Jorge", 33, "defr");

        Pila pila = new Pila();

        pila.push(a);

        pila.push(b);

        pila.push(c);

        pila.push(d);

        System.out.println(pila.ultimoElementoIngresado() +" : TAMAÑO DE LA PILA "+ pila.size());

        System.out.println("Elemento eliminado: " +pila.pop().toString());

        System.out.println(pila.ultimoElementoIngresado() +" : TAMAÑO DE LA PILA "+ pila.size());

    }
}