package animalkingdom;

import java.util.*;

public class Main 
{
    public static void printAnimal(ArrayList<Animals> animals, CheckAnimal tester)
    {
        for (Animals a : animals)
        {
            if (tester.test(a))
            {
                System.out.println(a.getName() + " " + a.getYear());
            }
        }
    }
    public static void main(String[] args) 
    {
        // instantiate mammals
        Mammals panda = new Mammals("Panda", 1869);
        Mammals zebra = new Mammals("Zebra", 1778);
        Mammals koala = new Mammals("Koala", 1816);
        Mammals sloth = new Mammals("Sloth", 1804);
        Mammals armadillo = new Mammals("Armadillo", 1758);
        Mammals raccoon = new Mammals("Raccoon", 1758);
        Mammals bigfoot = new Mammals("Bigfoot", 2021);
    
        // birds
        Birds pigeon = new Birds("Pigeon", 1837);
        Birds peacock = new Birds("Peacock", 1821);
        Birds toucan = new Birds("Toucan", 1758);
        Birds parrot = new Birds("Parrot", 1824);
        Birds swan = new Birds("Swan", 1758);

        // fishs
        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);

        System.out.println();
        System.out.println("*** Testing -- Mammal: " + panda.getName() + " " + panda.getYear() + ", Bird: " + swan.getName() + " " + swan.getYear() + ", Fish: " + salmon.getName() + " " + salmon.getYear() + " ***");
        System.out.println();

        // combining classes - mammal, bird, fish
        ArrayList<Animals> animalList = new ArrayList<Animals>();
        animalList.add(panda);
        animalList.add(zebra);
        animalList.add(koala);
        animalList.add(sloth);
        animalList.add(armadillo);
        animalList.add(raccoon);
        animalList.add(bigfoot);
        animalList.add(pigeon);
        animalList.add(peacock);
        animalList.add(toucan);
        animalList.add(parrot);
        animalList.add(swan);
        animalList.add(salmon);
        animalList.add(catfish);
        animalList.add(perch);

        // System.out.println("*** Animal List ***");
        // System.out.println(animalList.toString());
        // System.out.println();

        // Lambda Expression
        System.out.println("*** List descending order by year ***");
        animalList.sort((a1, a2) -> a2.getYear() - a1.getYear());
        animalList.forEach(a -> System.out.println(a.getName() + ", " + a.getYear()));
        System.out.println();

        System.out.println("*** List alphabetically ***");
        animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        animalList.forEach(a -> System.out.println(a.getName() + ", " + a.getYear()));
        System.out.println();

        System.out.println("*** List by how they move ***");
        animalList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        animalList.forEach(a -> System.out.println(a.move() + ", " + a.getName() + " (" + a.getYear() + ")"));
        System.out.println();

        System.out.println("*** List only the breath with lungs ***");
        printAnimal(animalList, a -> a.breath().equals("lungs"));
        System.out.println();

        System.out.println("*** List only the breath with lungs and were named in 1758 ***");
        printAnimal(animalList, a -> (a.breath().equals("lungs") && a.getYear() == 1758));
        System.out.println();

        System.out.println("*** List only lay eggs and breath with lungs ***");
        printAnimal(animalList, a -> (a.breath().equals("lungs") && a.reproduce().equals("eggs")));
        System.out.println();

        System.out.println("*** List alphabetically only named in 1758 ***");
        printAnimal(animalList, a -> a.getYear() == 1758);
        System.out.println();
        
    }
}
