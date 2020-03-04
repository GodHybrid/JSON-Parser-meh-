public class QuickStart 
{
    //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void main(String[] args) 
    {
        QuickStart _main = new QuickStart();

        Parser fileToRead = new Parser();

        fileToRead.printSuccinctInfo();

        fileToRead.printOutdated();
        
        fileToRead.showNewAfter("1998-10-08");
        fileToRead.showNewAfter("03/05/07");
        fileToRead.showNewAfter("14.01.2004");
        fileToRead.showNewAfter("03-12-10");

        fileToRead.allPapers("UAH");
        fileToRead.allPapers("EUR");
        fileToRead.allPapers("RUB");
        fileToRead.allPapers("USD");
    }
}