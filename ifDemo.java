package ifdemo;

import java.util.Scanner;

public class IfDemo{

    public static void main(String[] arg)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("\nPlease enter your age: ");

        int userAge = input.nextInt();

        if (userAge < 0 || userAge > 100)//first condition checked, if either one of them are met it executes
                                        // the task within and ignores the rest of the if statements.
        {
            System.out.println("Invalid Age");
            System.out.println("Age must be between 0 and 100");
        }
		else if (userAge < 18)
            System.out.println("Sorry you are underage");//we dont need curly braces if theres only one statement.
        else if (userAge < 21)
            System.out.println("You need parental consent");//we dont need curly braces if theres only one statement.
        else
        {
            System.out.println("Congratulations!");
            System.out.println("You may sign up for the event!");
        }
    }
}
