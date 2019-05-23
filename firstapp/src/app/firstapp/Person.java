package app.firstapp;

public class Person {

    private Name personName;
    private static int personCounter;

    public Person(Name personName)
    {
        this.personName = personName;
        personCounter ++;
    }

    public Person()
    {
        personCounter ++;
    }

    public String helloWorld() {
        return "Hello World";
    }

    public String helloName(String name)
    {
        return "Hello " + name;
    }

    public String helloPerson()
    {
        return  "Hello " + this.personName.getFullName();
    }

    public static int numberOfPersons()
    {
        return personCounter;
    }
}
