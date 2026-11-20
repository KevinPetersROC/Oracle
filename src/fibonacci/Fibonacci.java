package fibonacci;

public class Fibonacci
{
    static void main(String[] args)
    {
        System.out.println(fibonacci(4));
    }

    public static double fibonacci(double d)
    {
        if (d < 2)
            return d;
        else
        {
            return fibonacci(d - 1) + fibonacci(d - 2);
        }
    }
}
