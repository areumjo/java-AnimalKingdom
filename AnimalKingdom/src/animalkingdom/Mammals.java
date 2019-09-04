package animalkingdom;

public class Mammals extends Animals
{
    public String name;
    int number;
    public int year;

    public Mammals(String name, int year)
    {
        super(name, year);
        // this.name = name;
        // this.year = year;
    }

    @Override
    public String move()
    {
        return "walk";
    }

    @Override
    public String breath()
    {
        return "lungs";
    }

    @Override
    public String reproduce()
    {
        return "live births";
    }

    @Override
    public String toString()
    {
        return "Mammal{" +
                "name= " + name +
                ", year= " + year + "}";
    }
} 
