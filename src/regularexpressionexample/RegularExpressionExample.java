package regularexpressionexample;

public class RegularExpressionExample
{
    static void main(String[] args)
    {
        if(getAnimal("Dog"))
        {
            System.out.println("This is a valid animal");
        }
        else
        {
            System.out.println("This is not a valid animal");
        }
    }

    public static boolean getAnimal(String animal)
    {
        return animal.matches("[Cc]at|[Dd]og");
    }
}
