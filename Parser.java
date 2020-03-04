import Parser.*;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Parser 
{
    private Gson reader = new Gson();
    private String path;

    public List<Company> comps;

    public Parser()
    {
        path = "test.json";
    }

    public void ReadFile() throws FileNotFoundException
    {
        //if(CheckJSON() != "json") throw new FileNotFoundException("The file given was not a JSON file");
        try 
        {
            comps = reader.fromJson(new FileReader(new File(path)), new TypeToken<List<Company>>() {}.getType());
        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
            return;
        }

        return;
    }

    // private String CheckJSON()
    // {
    //     Optional<String> check = Optional.ofNullable(path)
    //     .filter(f -> f.contains("."))
    //     .map(f -> f.substring(path.lastIndexOf(".") + 1));
    //     return check.get();
    // }

    public void printSuccinctInfo() 
    {
        comps.stream().map(c -> String.format("%s -- Дата основания: %s", c.getname_short(), c.getegrul_date())).forEach(System.out::println);
	}

    public void printOutdated() 
    {
        comps.stream().map(Company::getSecurities).flatMap(Collection::stream).filter(d -> d.getdate_to().isBefore(LocalDate.now())).map(secure -> String.format("Полное имя: {%s}\nКод: {%s}\nСрок действия: {%s}\n", secure.getname_full(), secure.getCode(),secure.getdate_to())).forEach(System.out::println);
        System.out.println(comps.stream().map(Company::getSecurities).flatMap(Collection::stream).filter(x -> x.getDateTo().isBefore(LocalDate.now())).count());
	}

    public void showNewAfter(String tmp) 
    {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("[dd-MM-yyyy][dd-MM-yy][yyyy-MM-dd][yy-MM-dd][dd/MM/yyyy][dd/MM/yy][yyyy/MM/dd][yy/MM/dd][dd.MM.yyyy][dd.MM.yy][yyyy.MM.dd][yy.MM.dd]");
        try{LocalDate date = LocalDate.parse(tmp, parser);
            comps.stream().filter(company -> company.getegrul_date().isAfter(date)).map(company -> String.format("Имя (кратк.): {%s}\nДата основания: {%s}\n",company.getname_short(),company.getegrul_date())).forEach(System.out::println);
        }
        catch(DateTimeParseException e){e.printStackTrace();}
	}

    public void allPapers(String tmp) 
    {
        comps.stream().map(Company::getSecurities).flatMap(Collection::stream).filter(secure -> secure.getCurrency().getCode().equals(tmp)).map(secure -> String.format("ID: {%s}\nКод: {%s}\n", security.getId(),security.getCode())).forEach(System.out::println);
	}

}