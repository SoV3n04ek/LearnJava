import sun.util.resources.cldr.en.CalendarData_en_US_POSIX;

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int sixDigitNum = 1;

        System.out.println("Write 6 digit number: ");
        sixDigitNum = scanner.nextInt();

        if (sixDigitNum < 100000 || sixDigitNum > 999999)
        {
            System.out.println("Error. It's not a 6 digit number! ");
            return;
        }

        int n1, n2, n3, n4, n5, n6;
        n6 = sixDigitNum % 10;
        n5 = sixDigitNum / 10 % 10;
        n4 = sixDigitNum / 100 % 10;
        n3 = sixDigitNum / 1000 % 10;
        n2 = sixDigitNum / 10000 % 10;
        n1 = sixDigitNum / 100000;

        sixDigitNum = n6 * 100000;
        sixDigitNum += n5 * 10000;
        sixDigitNum += n3 * 1000;
        sixDigitNum += n4 * 100;
        sixDigitNum += n2 * 10;
        sixDigitNum += n1;

        System.out.println("Result: " + sixDigitNum);
    }
}