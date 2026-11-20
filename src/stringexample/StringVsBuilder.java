package stringexample;

public class StringVsBuilder
{
    static void main(String[] args)
    {
        StringBuilder str = new StringBuilder("Test immutability");
        String str2 = "Test immutability";

        System.out.println("Stringbuilder: " + str.hashCode());
        System.out.println("String: " + str2.hashCode());

        str.replace(0, str.length(), "HelloWorld");
        str2 = "HelloWorld";

        System.out.println("Stringbuilder: " + str.hashCode());
        System.out.println("String: " + str2.hashCode());
    }
}
