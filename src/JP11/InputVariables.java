package JP11;
import java.util.Scanner;

public class InputVariables
{


    static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        boolean boolVal;
        byte byteVal;
        char charVal;
        short shortVal;
        int intVal;
        long longVal;
        float floatVal;
        double doubleVal;

        System.out.println("Please enter a boolean value");
        boolVal = in.nextBoolean();

        System.out.println("Please enter a byte value");
        byteVal = in.nextByte();

        System.out.println("Please enter a char value");
        charVal = in.next().charAt(0);

        System.out.println("Please enter a short value");
        shortVal = in.nextShort();

        System.out.println("Please enter an integer value");
        intVal = in.nextInt();

        System.out.println("Please enter a long value");
        longVal = in.nextLong();

        System.out.println("Please enter a float value");
        floatVal = in.nextFloat();

        System.out.println("Please enter a double value");
        doubleVal = in.nextDouble();

        in.close();

        System.out.println("boolean value: " + boolVal);
        System.out.println("byte value : " + byteVal);
        System.out.println("char value : " + charVal);
        System.out.println("short value : " + shortVal);
        System.out.println("int value : " + intVal);
        System.out.println("long value : " + longVal);
        System.out.println("double value : " + floatVal);
        System.out.println("double value : " + doubleVal);
    }
}
