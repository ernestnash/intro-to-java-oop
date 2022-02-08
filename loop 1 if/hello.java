
package nashon;

/**
 * @author NASHON ERNEST
 *
 */
import java.util.Scanner;
public class hello {


	public static void main(String[] args) {
		
		System.out.println("Write something...");
		//prints onto the screen
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			String j=" ";
			//declaring a variable j which is a string
			
			while(!j.equals("quit"))/*loops over and over until user no longer needs the service and types quit*/{
				
				System.out.print("input: ");
				
				j = scanner.next().toLowerCase();
				
				if(!j.equals("quit"))
					//stops the program from echoing the quit statement
					
					System.out.println(j);
			}	
		}
	}

}
