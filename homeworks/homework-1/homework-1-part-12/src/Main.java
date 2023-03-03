import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void SortArray(int[] arr)
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

    public static void SortArrayByAscending(int[] arr)
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

        System.out.println("\nArray after sort:\n");
        SortArrayByAscending(arr);

        printArr(arr);

        if ()
    }
}