import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double distanceInMeters;
        final double inchesInMeter = 39.3701;
        final double yardInMeter = 1.09361;
        final double mileInMeter = 0.000621371;
        System.out.println("Enter count meters: ");
        distanceInMeters = scanner.nextDouble();

        System.out.println("What do you want?\n" +
                "Enter 1 - if you want to convert meter to mile\n" +
                "Enter 2 - if you want to convert meter to inch;\n" +
                "Enter 3 - if you want to convert meter to yard\n");
        System.out.print("Enter your answer: ");
        short answer = scanner.nextShort();

        if (answer < 1 || answer > 3)
        {
            System.out.println("Error! Answer is not equal 1 or 2 or 3");
            return;
        }

        double result = distanceInMeters;

        switch (answer)
        {
            case 1:
                result *= mileInMeter;
                break;
            case 2:
                result *= inchesInMeter;
                break;
            case 3:
                result *= yardInMeter;
                break;
        }

        System.out.println("Result: " + result);




    }
}