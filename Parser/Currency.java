package Parser;

public class Currency
{
    private Integer id;
    private String code;
    private String name_short;
    private String name_full;

    public Currency() 
    {
    }

    public Currency(Integer id, String code, String name_short, String name_full) 
    {
        super();
        this.id = id;
        this.code = code;
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

    public String getCode() 
    {
        return code;
    }

    public void setCode(String code) 
    {
        this.code = code;
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