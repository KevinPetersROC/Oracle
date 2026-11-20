package hashfruits;

import java.util.HashMap;

public class HashMapExample
{
    static void main(String[] args)
    {
        HashMap<String, String> fruitbowl = new HashMap<String, String>();

        addElements(fruitbowl);
        displayElements(fruitbowl);

        findElement(fruitbowl, "Apple");
        findElement(fruitbowl, "Pear");
    }

    static void displayElements(HashMap<String,String> fruitbowl)
    {
        for (HashMap.Entry<String, String> fruit : fruitbowl.entrySet())
        {
            System.out.println("Fruit: " + fruit.getKey() + " - Color: " + fruit.getValue());
        }
    }

    static void addElements(HashMap<String, String> fruitbowl)
    {
        fruitbowl.put("Apple", "Green");
        fruitbowl.put("Cherry", "Red");
        fruitbowl.put("Banana", "Yellow");
        fruitbowl.put("Orange", "Orange");
        fruitbowl.put("Apple", "Red");
    }

    static void findElement(HashMap<String, String> fruitbowl, String fruit)
    {
        if (fruitbowl.containsKey(fruit))
        {
            System.out.println("The " + fruit + " is " + fruitbowl.get(fruit));
        }
        else
        {
            System.out.println("There is no " + fruit + " in the bowl");
        }
    }
}
