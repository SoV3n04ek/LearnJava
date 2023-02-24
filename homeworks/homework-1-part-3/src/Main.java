import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int a1, a2, a3;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number first number of 3 digit number: ");
        a1 = scanner.nextInt();
        System.out.print("Enter number second number of 3 digit number: ");
        a2 = scanner.nextInt();
        System.out.print("Enter number third number of 3 digit number: ");
        a3 = scanner.nextInt();

        System.out.println("Result: " + a1 + a2 + a3);
    }
}