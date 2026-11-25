package assertex;

import java.util.Scanner;
public class AssertEx {
    //program that will convert a double to an int
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        double x = in.nextDouble();
        in.close();
        assert x < 2_147_483_647.0 : "Number too large to convert to integer";
            /*assert evaluates the Boolean expression
             If the expression evaluates to true the normal code continues,
             If the expression evaluates to false it will throw an
             AssertionsError exception*/

        System.out.println("Value of x: " + x);
        int y = (int) (x);
        System.out.println(y);
    }//end method main
}//end class assertex.AssertEx
