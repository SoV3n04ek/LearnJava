import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void sortArrayByAscending(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length - i - 1; j++)
            {
                if (arr[j+1] < arr[j])
                {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = t;
                }
            }
        }
    }

    public static void sortArrayByDescending(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length - i - 1  ; j++)
            {
                if (arr[j+1] > arr[j])
                {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = t;
                }
            }
        }
    }

    private static void printArr(int[] arr)
    {
        if (arr == null) return;

        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }

    private static void initArrByRandomNumbers(int[] arr)
    {
        if (arr == null)
            return;

        Random rnd = new Random();

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = rnd.nextInt(200) - 100;
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int size = 25;
        int[] arr = new int[size];

        initArrByRandomNumbers(arr);

        System.out.println("Array after init: ");
        printArr(arr);

        System.out.print("\nSort array by:" +
                "\nEnter 1 - if you want to sort array by ascending;\n" +
                "Enter 2 - if you want to sort array by descending;\n " +
                "Enter your answer: ");

        int answer = scanner.nextInt();

        if (answer == 1)
        {
            sortArrayByAscending(arr);
        }
        else
        {
            sortArrayByDescending(arr);
        }

        System.out.println("\nArray after sort:\n");
        
        printArr(arr);
    }
}