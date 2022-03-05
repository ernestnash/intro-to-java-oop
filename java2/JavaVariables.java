package java2;

import java.util.Scanner;

public class JavaVariables {
	public static int regNo;//same applies to float\\same applies to long
	public static String name;
	public static char gender;
	public static double phoneNumber;
	public static short age;
	public static boolean vote;
	
	//instanciate object s for class scanner imported for taking input.
	Scanner v = new Scanner(System.in);
	
	public void getData() {
		System.out.print("enter your registration number: ");
		regNo = v.nextInt();
		System.out.print("enter your name: ");
		name = v.next();
		System.out.print("Enter you gender M or F: ");
		gender = v.next().charAt(0);
		System.out.print("Enter your phone number: ");
		phoneNumber = v.nextDouble();
		System.out.print("Enter your age: ");
		age = v.nextShort();
		System.out.println("have you ever participated in an election? True or False ");
		vote = v.nextBoolean();
	}
	public void displayData() {
		System.out.println(regNo);
		System.out.println("your name is "+name);
		System.out.println("your gener is "+gender);
		System.out.println("your phoneNumber is "+phoneNumber);
		System.out.println("your age is "+age);
		System.out.println("can vote "+vote);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaVariables j = new JavaVariables();
		j.getData();
		j.displayData();
	}

}
