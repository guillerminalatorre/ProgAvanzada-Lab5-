import java.util.Objects;

public class Animal implements Comparable <Object>{

    private String name;

    public Animal (String name) {
        this.name = name;
    }
    public Animal() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        return this.toString().compareTo(o.toString());
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name=" + name  +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name);
    }

}
