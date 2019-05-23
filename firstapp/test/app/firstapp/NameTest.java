package app.firstapp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class NameTest {

    @Test
    public void shouldReturnFirstname()
    {
        String firstname = "John";

        String lastname = "Champion";

        Name name = new Name(firstname, lastname);
        assertEquals(firstname, name.getFirstname());
    }

    @Test
    public void shouldReturnLasttname()
    {
        String firstname = "John";

        String lastname = "Champion";

        Name name = new Name(firstname, lastname);
        assertEquals(lastname, name.getLastname());
    }

    @Test
    public void shouldReturnFullName()
    {
        String firstname = "John";

        String lastname = "Champion";

        Name name = new Name(firstname, lastname);
        assertEquals(firstname + ' ' + lastname, name.getFullName());
    }

    @Test
    public void shouldUpdateFirstname()
    {
        String firstname = "John";

        String lastname = "Champion";

        Name name = new Name(firstname, lastname);

        String newFirstName = "Alex";

        name.setFirstname(newFirstName);

        assertEquals(newFirstName, name.getFirstname());
        assertNotEquals(firstname, name.getFirstname());
    }

    @Test
    public void shouldUpdateLastname()
    {
        String firstname = "John";

        String lastname = "Champion";

        Name name = new Name(firstname, lastname);

        String newLasttName = "Queen";

        name.setLastname(newLasttName);

        assertEquals(newLasttName, name.getLastname());
        assertNotEquals(lastname, name.getLastname());
    }
}
