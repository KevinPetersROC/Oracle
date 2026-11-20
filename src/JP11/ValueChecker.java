package JP11;

import java.util.Scanner;

public class ValueChecker
{
    static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int num;

        do
        {
            System.out.println("Please fill in your number");
            num = in.nextInt();

            if (num == 7)
            {
                System.out.println("Lucky Number!");
            }
            else if (num == 13)
            {
                System.out.println("Unlucky Number!");
            }
            else if (num != 0)
            {
                System.out.println("Neither a lucky or unlucky number!");
            }
        } while (num != 0);
        in.close();
    }
}
