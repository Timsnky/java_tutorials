package app.firstapp;

public class Name {

    private String firstname;
    private String lastname;

    public Name(String firstname, String lastname)
    {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname()
    {
        return this.firstname;
    }

    public String getLastname() {
        return  this.lastname;
    }

    public String getFullName() {
        return this.firstname + " " + this.lastname;
    }

    public void setFirstname(String firstname)
    {
        this.firstname = firstname;
    }

    public void setLastname(String lastname){
        this.lastname = lastname;
    }
}
