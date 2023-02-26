import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int start;
        int end;

        System.out.println("Enter the value of start interval: ");
        start = scanner.nextInt();

        System.out.println("Enter the value of end interval: ");
        end = scanner.nextInt();

        if (end < start)
        {
            int t = start;
            start = end;
            end = t;
        }

        System.out.println("Result: \n");
        for (int i = start; i <= end; i++)
        {
            if (i % 2 != 0)
            {
                System.out.println(i);
            }
        }
    }
}