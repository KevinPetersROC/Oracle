package stringexample;

import java.lang.classfile.TypeAnnotation;
import java.util.ArrayList;
import java.util.Collections;

public class StringManipulation
{
    static void main(String[] args)
    {
        String str = "Parse this string";
        ArrayList<String> words = new ArrayList<String>();

        //forParse(str, words);

        String sentence = "This is my sentence";

    }

    static void splitParse(String sentence, String[] word)
    {
            word = sentence.split(" ");
        //words will look like {This,is,my,sentence}
        String[] tokens = sentence.split("i");
        //tokens will look like {Th,s ,s my sentence}
        for(String token : tokens)
            System.out.print(token + ", ");
        //endfor
    }

    static void forParse(String str, ArrayList<String> words)
    {
        while(str.length() > 0)
        {
            for(int i = 0; i < str.length(); i++)
            {
                if(i == str.length()-1)
                {
                    words.add(str.substring(0));
                    str = "";
                    break;
                }
                else if(str.charAt(i) == ' ')
                {
                    words.add(str. substring(0, i));
                    str = str.substring(i + 1);
                    break;
                }
            }
        }

        for(String s : words)
        {
            System.out.println(s + ' ');
        }

        System.out.println("\nThere are " + words.size() + " words in the original String");
        Collections.sort(words);
        System.out.println(words);
    }
}
