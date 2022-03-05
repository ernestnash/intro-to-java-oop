package java2;

import java.util.Scanner;//importing class Scanner for inputting in java.

public class Shirt {
//	class variable initialization.
	public static String color;
	public static char size;
	
//	create an instance of class Scanner.
	Scanner s = new Scanner(System.in);
	
//	methods of class Shirt.
	public void putOn() {
		System.out.println("the shirt is on");
	}
	
	public void takeOff() {
		System.out.println("the shirt is off");
	}
	
	public void getData() {
		System.out.println("enter color of the shirt: ");
		
//		to get input of data type String. ALT we could use [color =s.nextLine();]
		color = s.next();
		
		System.out.println("enter size of the shirt: ");
		
//		to get input of data type character
		size = s.next().charAt(0);
	}
	
	public void displayData() {
		System.out.println(color);
		System.out.println(size);
	}
	
	public static void main(String[] args) {
		Shirt t = new Shirt();//call an instance of class Shirt
		t.putOn();
		t.takeOff();
		t.getData();
		t.displayData();
	}
}
