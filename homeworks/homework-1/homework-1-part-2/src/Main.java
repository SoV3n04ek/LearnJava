import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double value = 1;
        double percentage = 1;

        System.out.println("Enter a value: ");
        value = scanner.nextDouble();

        System.out.println("Enter a percetage which you want calculate to your value: ");
        percentage = scanner.nextDouble();

        if (percentage > 0)
            System.out.println(percentage + "% of " + value + " = " + (percentage / 100.0) * value);
        else
            System.out.println(percentage + "% of " + value + " = 0");
    }
}