import java.util.Scanner;
import java.util.Random;

public class Main
{
    public static void initArrayRandomNumbers(int[] arr, int countNumbers)
    {
        Random random = new Random();

        for (int i = 0; i < countNumbers; i++)
        {
            arr[i] = random.nextInt(100) - 50;
        }
    }

    public static int findMaxValue(int[] arr, int countNumbers)
    {
        int max = arr[0];
        for (int i = 1; i < countNumbers; i++)
        {
            if (max < arr[i])
            {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findMinValue(int[] arr, int countNumbers)
    {
        int min = arr[0];
        for (int i = 1; i < countNumbers; i++)
        {
            if (min > arr[i])
            {
                min = arr[i];
            }
        }
        return min;
    }

    public static int countNegativeNumbers(int[] arr, int countNumbers)
    {
        int count = 0;
        for (int i = 0; i < countNumbers; i++)
        {
            if (0 > arr[i])
            {
                count++;
            }
        }
        return count;
    }

    public static int countPositiveNumbers(int[] arr, int countNumbers)
    {
        int count = 0;
        for (int i = 0; i < countNumbers; i++)
        {
            if (arr[i] > 0)
            {
                count++;
            }
        }
        return count;
    }

    public static int countZeroNumbers(int[] arr, int countNumbers)
    {
        int count = 0;
        for (int i = 0; i < countNumbers; i++)
        {
            if (arr[i] == 0)
            {
                count++;
            }
        }
        return count;
    }

    public static void printArray(int[] numbers, int countNumbers)
    {
        for (int i = 0; i < countNumbers; i++)
        {
            System.out.print(numbers[i] + " ");
        }
        System.out.print("\n");
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter count of numbers in array: ");

        int countNumbers = scanner.nextInt();
        int[] numbers = new int [countNumbers];

        initArrayRandomNumbers(numbers, countNumbers);

        printArray(numbers, countNumbers);

        System.out.println("\n\nMax: " + findMaxValue(numbers, countNumbers));
        System.out.println("Min: " + findMinValue(numbers, countNumbers));
        System.out.println("\nCount numbers > 0: " + countPositiveNumbers(numbers, countNumbers));
        System.out.println("Count numbers < 0: " + countNegativeNumbers(numbers, countNumbers));
        System.out.println("Count numbers == 0: " + countZeroNumbers(numbers, countNumbers));
    }
}