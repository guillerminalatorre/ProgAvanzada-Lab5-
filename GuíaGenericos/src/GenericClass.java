import javax.xml.bind.Element;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

public class GenericClass <T extends Comparable>{


    public List<T> elements;

    public GenericClass() {
        this.elements = new ArrayList<T>();
    }

    public boolean addElement (T element) throws MyException {
        boolean reply = false;

        if (!elementExist(element)) {
            elements.add(element);
            reply = true;
        }
        else{
            throw new MyException ("Is already exist a element like that");
        }
        return reply;
    }

    public boolean elementExist (T element)
    {
        AtomicBoolean reply = new AtomicBoolean(false);

        //Intento de uso de Lambda.

        if(!this.elements.isEmpty()){
            Consumer<T> elementAlreadyExist = p1 -> {
                if(p1.compareTo(element) == 0 ){
                    reply.set(true);
                };
            };

            this.elements.forEach(elementAlreadyExist);
        }

        return reply.get();
    }

    public T maxElement()
    {
        T reply = null;

        if(!elements.isEmpty())
        {
            reply = elements.get(0);

            for (T t: elements) {
                if(t.compareTo(reply) > 0) {
                    reply = t;
                }
            };

        }

        return reply;
    }

    public T minElement()
    {
        T reply = null;

        if(!elements.isEmpty())
        {
            reply = elements.get(0);

            for (T t: elements) {

                if(t.compareTo(reply) < 0) {
                    reply = t;
                }
            };

        }

        return reply;
    }

    public T removeLastElement ()
    {
        T reply = null;

        if(!elements.isEmpty()) {
            reply = elements.remove(elements.size() - 1);
        }

        return reply;
    }

    @Override
    public String toString()
    {
        StringBuilder reply = new StringBuilder();

        Consumer<T> addElementToString = p -> {
            reply.append(p.toString() + ";\n");
        };

        this.elements.forEach(addElementToString);

        return reply.toString();
    }
}
