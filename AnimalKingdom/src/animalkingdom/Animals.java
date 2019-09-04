package animalkingdom;

public abstract class Animals
{
    // assign a unique number, a name, and year
    int number;
    String name;
    int year;

    // abstract method -- don't have a body, body is provided by the subclass
    public abstract String move();
    public abstract String breath();
    public abstract String reproduce();
    
    // regular method
    public void consume()
    {
        System.out.println("Consume");
    }
    
}