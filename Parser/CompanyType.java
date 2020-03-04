package Parser;

public class CompanyType
{
    private Integer id;
    private String name_short;
    private String name_full;

    public CompanyType() 
    {
    }

    public CompanyType(Integer id, String name_short, String name_full) 
    {
        super();
        this.id = id;
        this.name_short = name_short;
        this.name_full = name_full;
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

    public String getname_short() 
    {
        return name_short;
    }

    public void setname_short(String name_short) 
    {
        this.name_short = name_short;
    }

    public String getname_full() 
    {
        return name_full;
    }

    public void setname_full(String name_full) 
    {
        this.name_full = name_full;
    }
}