//NAME - Trent Cathey

import java.util.Scanner;

public class Input
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int intOne, intTwo;
        //add more variables, at least 2 of each type:
        //double, float, short, String
        double douOne, douTwo;
        float floOne, floTwo;
        short shoOne, shoTwo;
        System.out.print("Enter an integer :: ");
        intOne = keyboard.nextInt();

        System.out.print("Enter an integer :: ");
        intTwo = keyboard.nextInt();

        //add in input for all variables
        System.out.print("Enter a decimal ::");
        douOne = keyboard.nextDouble();

        System.out.print("Enter a decimal ::");
        douTwo = keyboard.nextDouble();

        System.out.print("Enter a decimal ::");
        floOne = keyboard.nextFloat();

        System.out.print("Enter a decimal ::");
        floTwo = keyboard.nextFloat();

        System.out.print("Enter a negative number ::");
        shoOne = keyboard.nextShort();

        System.out.print("Enter a negative number ::");
        shoTwo = keyboard.nextShort();

        System.out.print("Enter some text ::");
        String textOne = keyboard.next();

        System.out.println("Enter some more text ::");
        String textTwo = keyboard.next();

        System.out.println();
        System.out.println("integer one = " + intOne );
        System.out.println("integer two = " + intTwo );

        //add output for all variables
        System.out.println("double one = " + douOne);
        System.out.println("double two = " + douTwo);
        System.out.println("float one = " + floOne);
        System.out.println("float two = " + floTwo);
        System.out.println("short one = " + shoOne);
        System.out.println("short two = " + shoTwo);
        System.out.println("First Text = " + textOne);
        System.out.println("Second Text = " + textTwo);

    }
}