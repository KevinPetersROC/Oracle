package JP11;
import java.util.Scanner;

public class AgeChecker
{
    static void main()
    {
        Scanner in = new Scanner(System.in);
        int age;
        char hasLicense;

        System.out.println("Please fill in your age:");
        age = in.nextInt();
        System.out.println("Do you have a drivers license? y for yes, n for no");
        hasLicense = in.next().charAt(0);

        if (age > 17 && hasLicense == 'y')
        {
            System.out.println("You're an adult and can rent a car");
        }
        else
        {
            System.out.println("You're not an adult or dont have a license");
        }

    }
}
