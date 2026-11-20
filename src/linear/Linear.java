package linear;

public class Linear
{
    static void main(String[] args)
    {
        double d = 5.0;

        System.out.println("Factorial [" + Linear.Factorial(d) + "] of [" + d + "]" );
    }

    public static double Factorial (double d)
    {
        if (d <= 1)
            return 1;
        else
        {
            return d * Factorial(d - 1);
        }
    }
}
