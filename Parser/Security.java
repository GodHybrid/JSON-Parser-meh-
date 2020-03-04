package Parser;

import java.time.LocalDate;

public class Security
{
    private Integer id;
    private String code;
    private String name_full;
    private String cfi;
    private LocalDate date_to;
    private LocalDate state_reg_date;
    private State state;
    private Currency currency;

    public Security() 
    {
    }

    public Security(Integer id, String code, String name_full, String cfi, String date_to, String state_reg_date, State state, Currency currency) 
    {
        super();
        this.id = id;
        this.code = code;
        this.name_full = name_full;
        this.cfi = cfi;
        this.date_to = LocalDate.parse(date_to);
        this.state_reg_date = LocalDate.parse(state_reg_date);
        this.state = state;
        this.currency = currency;
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

    public String getname_full() 
    {
    return name_full;
    }

    public void setname_full(String name_full) 
    {
    this.name_full = name_full;
    }

    public String getCfi() 
    {
    return cfi;
    }

    public void setCfi(String cfi) 
    {
    this.cfi = cfi;
    }

    public LocalDate getdate_to() 
    {
    return date_to;
    }

    public void setdate_to(String date_to) 
    {
    this.date_to = LocalDate.parse(date_to);
    }

    public LocalDate getstate_reg_date() 
    {
    return state_reg_date;
    }

    public void setstate_reg_date(String state_reg_date) 
    {
    this.state_reg_date = LocalDate.parse(state_reg_date);
    }

    public State getState() 
    {
    return state;
    }

    public void setState(State state) 
    {
    this.state = state;
    }

    public Currency getCurrency() 
    {
    return currency;
    }

    public void setCurrency(Currency currency) 
    {
    this.currency = currency;
    }
}