package Demo7.day.org;
import java.util.regex.Pattern;

import java.util.Scanner;



public class Regularexp {
	
	static Scanner scan= new Scanner(System.in);

  
	public static void main(String[] args) {
		String empID;
		System.out.println("Enter the id");
		empID= scan.next();
		
		if(empID.matches("\\d{5}_(FS|TD|IN)"))
			System.out.println(" This is valid");
		else
			System.out.println(" this is false");
			
			
		
		
		// TODO Auto-generated method stub

	}

}
