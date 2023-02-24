import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int monthNum;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of month: ");

        monthNum = scanner.nextInt();

        if (monthNum < 1 || monthNum > 12)
        {
            System.out.println("Error! It's not a number of month");
            return;
        }

        switch (monthNum) {
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
        }
    }
}