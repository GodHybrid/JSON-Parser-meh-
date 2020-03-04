package Parser;

public class State
{
    private Integer id;
    private String name;

    public State() 
    {
    }

    public State(Integer id, String name) 
    {
        super();
        this.id = id;
        this.name = name;
    }

        ////////////////////////////////////////Getters & Setters////////////////////////////////////////////////

    public Integer getId() 
    {
        return id;
    }

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }
}