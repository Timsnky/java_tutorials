package app.firstapp;

public class Main {

    public static void main(String [] args)
    {
        Name personName = new Name("John", "Champion");

        Person person = new Person(personName);

        System.out.println(person.helloPerson());
    }
}
