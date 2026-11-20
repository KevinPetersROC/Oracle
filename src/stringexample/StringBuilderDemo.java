package stringexample;

public class StringBuilderDemo
{
    static void main(String[] args)
    {
        StringBuilder str = new StringBuilder("Learning java with oracle");
        System.out.println("string = " + str);

        System.out.println("String Length: " + str.length());
        System.out.println("Starting Char: " + str.charAt(0));
        System.out.println("Second Char: " + str.charAt(1));
        System.out.println("acl start: " + str.indexOf("acl"));
        System.out.println("Text Included: " + str.substring(1, 4));

        System.out.println("Reverse: " + str.reverse());
        System.out.println("Correct: " + str.reverse());

        str.append(" is fun");
        System.out.println("appended string: " + str);

        str.delete(8, 13);
        System.out.println("Deleted String: " + str);

        str.insert(8, " java programming");
        System.out.println("Inserted String: " + str);

        str.replace(13, 25, " String Processing");
        System.out.println("Replaced String: " + str);

        System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf("Q"));
        System.out.println(str.indexOf("a", 7));
    }
}
