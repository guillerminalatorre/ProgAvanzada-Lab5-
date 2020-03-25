import java.util.Objects;

public class Person implements Comparable <Object> {

    private String name;
    private int id;
    private String adress;

    public Person(String name, int Id, String adress) {
        this.name = name;
        this.id = Id;
        this.adress = adress;
    }

    public Person()
    {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int Id) {
        this.id = Id;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public int compareTo(Object o) {

        return this.toString().compareTo(o.toString());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return id == person.id &&
                name.equals(person.name) &&
                adress.equals(person.adress);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", id=" + id +
                ", adress=" + adress +
                '}';
    }
}
