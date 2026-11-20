package accountgenerator;

import java.util.Scanner;

public class Employee
{
    private final String name, username, email;
    private String password;

    public String toString()
    {
        return "Employee Details"
            + "\nName       : " + this.name
            + "\nUsername   : " + this.username
            + "\nEmail      : " + this.email
            + "\nPassword   : " + this.password;
    }

    public Employee()
    {
        name = setName();
        username = setUsername(name);
        email = setEmail(username);
        password = setPassword(username);
    }

    private int countChars(String str, char c)
    {
        int count = 0;
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == c)
                count++;
        }
        return count;
    }

    private String setName()
    {
        int charCount = 0;
        Scanner in = new Scanner(System.in);
        String name;

        do
        {
            System.out.println("Please enter employee's first and last name: ");
            name = in.nextLine();
            if (name.matches(".+ .+"))
            {
                charCount = countChars(name, ' ');
            }
            else
            {
                System.out.println("Incorrect format for name");
            }
        }
        while(charCount != 1);
        in.close();
        return name;
    }

    private String setUsername(String name)
    {
        name = name.toLowerCase();
        return name.replace(' ', '.');
    }

    private String setEmail(String user)
    {
        int pos;

        pos = user.indexOf('.');
        return user.charAt(0) + user.substring(pos + 1) + "@oracleacademy.test";
    }

    private String setPassword(String user)
    {
        int maxLength = 8;

        if(user.length() < maxLength)
        {
            while(user.length() < maxLength)
                user += '*';
        }
        else
            user = user.substring(0, 8);

        user = user.replaceAll("[aeiou]", "*");

        for(int i = 0; i < user.length(); i++)
        {
            if (Character.isLetter(user.charAt(i)))
            {
                if (i == 0)
                {
                    user = user.substring(0, 1).toUpperCase() + user.substring(1);
                    break;
                }
                else
                {
                    if (i == user.length() - 1)
                    {
                        user = user.substring(0, i) + user.substring(i).toUpperCase();
                        break;
                    }
                    else
                    {
                        String str1 = user.substring(0, i);
                        String str2 = user.substring(i, i + 1).toUpperCase();
                        String str3 = user.substring(i + 1);
                        user = str1 + str2 + str3;
                        break;
                    }
                }
            }
        }
        return user;
    }

    public String reverse(String str)
    {
        String strRev = "";
        for (int i = str.length()-1; i >= 0; i--)
        {
            strRev += str.charAt(i);
        }
        return strRev;
    }
}
