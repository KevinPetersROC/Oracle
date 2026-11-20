package sortexample;

public class SortExample
{
    static void main(String[] args)
    {
        int[] numbers =  {40, 7, 59, 4, 1};

        displayValues(numbers);
        selectionSort(numbers);
        if(binarySearch(numbers, 7))
            System.out.println("The value is found");
        else
            System.out.println("The value is not found");
    }

    static void bubbleSort(int[] numbers)
    {
        for (int i = 0; i < numbers.length; i++)
        {
            boolean flag = false;
            for (int j = 0; j < numbers.length; j++)
            {
                if (numbers[j] > numbers[j + 1])
                {
                    flag = true;
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
            if (!flag)
            {
                return;
            }
        }
    }

    static void sequentialSearch(int[] numbers, int value)
    {
        for(int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] == value)
            {
                System.out.println("The number " + value + " is at position " + i + " in the list");
                return;
            }
        }
        System.out.println("The number " + value + " is not in the list");
    }

    static void selectionSort(int[] numbers)
    {
        int indexMin = 0;
        for (int i = 0; i < numbers.length; i++)
        {
            indexMin = i;
            for (int j = i + 1; j < numbers.length; j++)
            {
                if(numbers[j] < numbers[indexMin])
                {
                    indexMin = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[indexMin];
            numbers[indexMin] = temp;
        }
    }

    static void displayValues(int[] numbers)
    {
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println(numbers[i] + " ");
        }
        System.out.println("\n");
    }

    static boolean binarySearch(int[] numbers, int value)
    {
        int low = 0;
        int high = numbers.length - 1;
        while (high >= low)
        {
            int middle = (low + high)/2;
            if (numbers[middle] == value)
            {
                return true;
            }
            if (numbers[middle] < value)
            {
               low = middle + 1;
            }
            if (numbers[middle] > value)
            {
                high = middle - 1;
            }
        }
        return false;
    }
}
