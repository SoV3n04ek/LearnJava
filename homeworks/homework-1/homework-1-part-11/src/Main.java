import java.util.Scanner;
public class Main
{
    public static void printLine(String symbol, boolean isHorizontal, int length)
    {
        for (int i = 0; i < length; i++)
        {
            if (isHorizontal)
                System.out.print(symbol + " ");
            else
                System.out.println(symbol);
        }
    }


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the symbol which you wanna see in your line: ");
        String symbol = scanner.nextLine();

        System.out.print("Will your line be horizontal? (true or false): ");
        boolean isHorizontal = scanner.nextBoolean();

        System.out.println("Enter length of your line: ");
        int length = scanner.nextInt();

        printLine(symbol,  isHorizontal, length);
    }
}