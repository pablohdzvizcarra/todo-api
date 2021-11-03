package jvm.pablohdz.todoapi.dto;

public class UserAdminRequest
{

    private String name;
    private String lastname;
    private String username;
    private String email;

    public UserAdminRequest()
    {
    }

    public UserAdminRequest(String name, String lastname, String username, String email)
    {
        this.name = name;
        this.lastname = lastname;
        this.username = username;
        this.email = email;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getLastname()
    {
        return lastname;
    }

    public void setLastname(String lastname)
    {
        this.lastname = lastname;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
}
