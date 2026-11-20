package sortAndSearch;

import java.util.Random;
import java.util.Scanner;

public class SortAndSearch
{
    static void main(String[] args)
    {
        int[] numbers = new int[50];
        Scanner input = new Scanner(System.in);
        int num, pos;

        fillArray(numbers);
        displayArray(numbers, "Unordered list");

        num = getNumber(input);
        pos = searchArray(numbers, num);

        displayResult(pos, num);
        sortArray(numbers);
        displayArray(numbers, "\nOrdered List");

        pos = searchArray(numbers, num);
        displayResult(pos, num);
    }

    public static void displayResult(int pos, int num)
    {
        if (pos < 0)
            System.out.println("\nThe value " + num + " was not found!");
        else
            System.out.println("\nThe value " + num + " was found at position " + pos);
    }

    public static void sortArray(int[] numbers)
    {
        int swaps = 0;

        for (int j = 0; j < numbers.length; j++)
        {
            for (int i = 0; i < numbers.length; i++)
            {
                if (numbers[i] > numbers[i + 1])
                {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    swaps++;
                }
            }
        }
        System.out.println("\nNumber of Swaps: " + swaps);
    }

    public static int searchArray(int[] numbers, int num)
    {
        int tempPos = -1;
        int compares = 0;

        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] == num)
            {
                tempPos = i;
            }
            compares++;
        }
        System.out.println("\nElements compared: " + compares);
        return tempPos;
    }

    public static int getNumber(Scanner input)
    {
        int tempNum;

        System.out.println("\nEnter Search Number: ");
        tempNum = input.nextInt();

        return tempNum;
    }

    public static void fillArray(int[] numbers)
    {
        Random rand = new Random();

        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = rand.nextInt(100);
        }
    }

    public static void displayArray(int[] numbers, String message)
    {
        System.out.println(message);
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println(numbers[i] + " ");
        }
    }
}
