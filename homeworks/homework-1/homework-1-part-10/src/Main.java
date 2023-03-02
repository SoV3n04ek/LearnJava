import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void initArrByRandomNumbers(int arr[], int size)
    {
        Random random = new Random();

        for (int i = 0; i < size; i++)
        {
            arr[i] = random.nextInt(200) - 100;
        }
    }

    public static int[] getArrayWithOnlyEvenNumbers(int[] arr)
    {
        int countEvenNumbers = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] % 2 == 0)
            {
                countEvenNumbers++;
            }
        }

        if (countEvenNumbers == 0)
            return null;

        int[] evenNumbersArr = new int [countEvenNumbers];

        int j = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] % 2 == 0)
            {
                evenNumbersArr[j++] = arr[i];
            }
        }

        return evenNumbersArr;
    }

    public static int[] getArrayWithOnlyUnevenNumbers(int[] arr)
    {
        int countUnevenNumbers = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] % 2 != 0)
            {
                countUnevenNumbers++;
            }
        }

        if (countUnevenNumbers == 0)
            return null;

        int[] unevenNumbersArr = new int [countUnevenNumbers];

        int j = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] % 2 != 0)
            {
                unevenNumbersArr[j++] = arr[i];
            }
        }

        return unevenNumbersArr;
    }

    public static int[] getArrayWithOnlyNegativeNumbers(int[] arr)
    {
        int countNegativeNumbers = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < 0)
            {
                countNegativeNumbers++;
            }
        }

        if (countNegativeNumbers == 0)
            return null;

        int[] negativeNumbersArr = new int [countNegativeNumbers];

        int j = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < 0)
            {
                negativeNumbersArr[j++] = arr[i];
            }
        }

        return negativeNumbersArr;
    }

    public static int[] getArrayWithOnlyPositiveNumbers(int[] arr)
    {
        int countPositiveNumbers = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > 0)
            {
                countPositiveNumbers++;
            }
        }

        if (countPositiveNumbers == 0)
            return null;

        int[] positiveNumbersArr = new int [countPositiveNumbers];

        int j = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > 0)
            {
                positiveNumbersArr[j++] = arr[i];
            }
        }

        return positiveNumbersArr;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter count symbols in array: ");
        int count = scanner.nextInt();
        int[] arr = new int [count];

        
    }
}