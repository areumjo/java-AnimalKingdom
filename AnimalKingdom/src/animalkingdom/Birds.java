package animalkingdom;

public class Birds extends Animals
{
    public String name;
    int number;
    public int year;

    public Birds(String name, int year)
    {
        super(name, year);
        // this.name = name;
        // this.year = year;
    }

    @Override
    public String move()
    {
        return "fly";
    }

    @Override
    public String breath()
    {
        return "lungs";
    }

    @Override
    public String reproduce()
    {
        return "eggs";
    }

    @Override
    public String toString()
    {
        return "Birds{" +
                "name= " + name +
                ", year= " + year + "}";
    }
} 
