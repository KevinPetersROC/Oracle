package linear;


public class NonLinear
{
    static void main(String[] args)
    {
        double d;

        if (args.length > 0)
            d = new Integer(args[0]).doubleValue();
        else
            d = 5;

        for (double i = 0; i < d; i++)
        {
            System.out.println("Fibonacci Index [" + i + "] value [" + NonLinear.fibonacci(i) + "]");
        }
    }


    public static double fibonacci(double d)
    {
        if (d < 2)
            return 2;
        else
            return fibonacci(d - 1) + fibonacci(d - 2);

    }
}
