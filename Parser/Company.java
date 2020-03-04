package Parser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Company 
{
    private Integer id;
    private String code;
    private String name_full;
    private String name_short;
    private String inn;
    private CompanyType company_type;
    private String ogrn;
    private LocalDate egrul_date;
    private Country country;
    private String fio_head;
    private String address;
    private String phone;
    private String e_mail;
    private String www;
    private Boolean is_resident;
    private List<Security> securities = new ArrayList<>();

    public Company() 
    {
        
    }

    public Company(Integer id, String code, String name_full, String name_short, String inn, CompanyType companyType,
            String ogrn, String egrul_date, Country country, String fio_head, String address, String phone, String e_mail,
            String www, Boolean is_resident, List<Security> securities) 
    {
        super();
        this.id = id;
        this.code = code;
        this.name_full = name_full;
        this.name_short = name_short;
        this.inn = inn;
        this.company_type = companyType;
        this.ogrn = ogrn;
        this.egrul_date = LocalDate.parse(egrul_date);
        this.country = country;
        this.fio_head = fio_head;
        this.address = address;
        this.phone = phone;
        this.e_mail = e_mail;
        this.www = www;
        this.is_resident = is_resident;
        this.securities = securities;
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

    public String getname_short() 
    {
    return name_short;
    }

    public void setname_short(String name_short) 
    {
    this.name_short = name_short;
    }

    public String getInn() 
    {
    return inn;
    }

    public void setInn(String inn) 
    {
    this.inn = inn;
    }

    public CompanyType getCompanyType() 
    {
    return company_type;
    }

    public void setCompanyType(CompanyType companyType) 
    {
    this.company_type = companyType;
    }

    public String getOgrn() 
    {
    return ogrn;
    }

    public void setOgrn(String ogrn) 
    {
    this.ogrn = ogrn;
    }

    public LocalDate getegrul_date() 
    {
    return egrul_date;
    }

    public void setegrul_date(String egrul_date) 
    {
    this.egrul_date = LocalDate.parse(egrul_date);
    }

    public Country getCountry() 
    {
    return country;
    }

    public void setCountry(Country country) 
    {
    this.country = country;
    }

    public String getfio_head() 
    {
    return fio_head;
    }

    public void setfio_head(String fio_head) 
    {
    this.fio_head = fio_head;
    }

    public String getAddress() 
    {
    return address;
    }

    public void setAddress(String address) 
    {
    this.address = address;
    }

    public String getPhone() 
    {
    return phone;
    }

    public void setPhone(String phone) 
    {
    this.phone = phone;
    }

    public String gete_mail() 
    {
    return e_mail;
    }

    public void sete_mail(String e_mail) 
    {
    this.e_mail = e_mail;
    }

    public String getWww() 
    {
    return www;
    }

    public void setWww(String www) 
    {
    this.www = www;
    }

    public Boolean getis_resident() 
    {
    return is_resident;
    }

    public void setis_resident(Boolean is_resident) 
    {
    this.is_resident = is_resident;
    }

    public List<Security> getSecurities() 
    {
    return securities;
    }

    public void setSecurities(List<Security> securities) 
    {
    this.securities = securities;
    }
}