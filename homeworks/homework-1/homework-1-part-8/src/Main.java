import java.util.Scanner;

public class Main
{
    public static void printMultiplicationTable(int startInterval, int endInterval)
    {
        if (endInterval < startInterval)
        {
            int t = startInterval;
            startInterval = endInterval;
            endInterval = startInterval;
        }

        for (int i = startInterval; i <= endInterval; i++)
        {
            for (int multiplication = 1; multiplication <= 10; multiplication++)
            {
                System.out.print(i + "*" + multiplication + " = " + (multiplication * i) + " ");
            }
            System.out.print("\n.............................\n");
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a num of start interval: ");
        int startInterval = scanner.nextInt();

        System.out.println("Enter a num of end interval: ");
        int endInterval = scanner.nextInt();

        printMultiplicationTable(startInterval, endInterval);
    }
}