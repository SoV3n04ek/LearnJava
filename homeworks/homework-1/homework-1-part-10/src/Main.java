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

    

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter count symbols in array: ");
        int count = scanner.nextInt();
        int[] arr = new int [count];


    }
}