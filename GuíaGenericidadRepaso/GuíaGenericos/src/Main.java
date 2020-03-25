import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("GUÍA DE GENÉRICOS");

	    int control;

	    GenericClass generics = new GenericClass();

	    Scanner scanner = new Scanner(System.in);


	    do {
            Person person = new Person();

            System.out.println("--Insert a person--\nname:");
            person.setName( scanner.nextLine() );

            scanner.nextLine();

            System.out.println("\nid:");
            person.setId(scanner.nextInt());

            scanner.nextLine();

            System.out.println("\nadress:");
            person.setAdress(scanner.nextLine());

            try {
                generics.addElement(person);
            }
            catch(MyException exception)
            {
                exception.printStackTrace();
                System.out.println(exception.getErrorMessage());
            }

            scanner.nextLine();

            System.out.println("--Inserting a animal--\nname:");

            Animal animal = new Animal();
            animal.setName(scanner.nextLine());

            try {
                generics.addElement(animal);
            }
            catch(MyException exception)
            {
                exception.printStackTrace();
                System.out.println(exception.getErrorMessage());
            }

            scanner.nextLine();

            System.out.println("Insert 1 to continue:");
            control = scanner.nextInt();

            scanner.nextLine();
        }while (control == 1);

	    System.out.println(generics.toString());

	    System.out.println("\nThe smallest element in the list: ");

	    System.out.println(generics.minElement().toString());

        System.out.println("\nThe biggest element in the list: ");

        System.out.println(generics.maxElement().toString());

        System.out.println("\nRemove the last element in the list: ");

        System.out.println(generics.removeLastElement());

    }
}
