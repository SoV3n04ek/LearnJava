import java.util.Scanner;
import java.util.Random;

public class Main
{
    public static void initArrayRandomNumbers(int[] arr, int countNumbers)
    {
        Random random = new Random();

        for (int i = 0; i < countNumbers; i++)
        {
            arr[i] = random.nextInt(100);
        }
    }

    public static void findMaxValue()
    {}

    public static void findMinValue()
    {}



    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter count of numbers in array: ");

        int countNumbers = scanner.nextInt();
        int[] numbers = new int [countNumbers];

        initArrayRandomNumbers(numbers, countNumbers);

        for (int i = 0; i < countNumbers; i++)
        {
            System.out.print(numbers[i] + " ");
        }
    }
}