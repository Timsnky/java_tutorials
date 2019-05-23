package app.firstapp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void shouldReturnHelloWorld() {
        Person person1 = new Person();
        assertEquals("Hello World", person1.helloWorld());
    }

    @Test
    public void shouldReturnPersonName()
    {
        Person person = new Person();
        assertEquals("Hello John", person.helloName("John"));
    }

    @Test
    public void shouldReturnPersonFullName()
    {
        Name personName = new Name("John", "Champion");
        Person person2 = new Person(personName);

        assertEquals("Hello John Champion", person2.helloPerson());
    }

    @Test
    public void shouldReturnNumberOfPersons()
    {
        int startCount = Person.numberOfPersons();

        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person(new Name("John", "Champion"));

        assertEquals(startCount + 3, Person.numberOfPersons());
    }

}
