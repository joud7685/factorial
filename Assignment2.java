/** Joud Hatem Alharbi 
ID Number: 442010694 
Group : 1 
*/

package clock;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		
		int number;
		System.out.println("Enter a number ^^ ");
		Scanner Keyboard = new Scanner(System.in);
		number=Keyboard.nextInt(); // The user will enter a number. 
		factorial (number); // Call the method.
	} 
	
	
	
	public static void factorial (int number) //The method.
		{ 
		        int fact ;
			    fact=1;
			    for(int count=1; count<=number; count++) 
			    {
			    	fact =fact*count;
			    }
			    
			    System.out.println("The factorial number is "+fact );  // Display factorial number.
		}
	   
	    

	   

}
