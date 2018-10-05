package Demo7.day.org;

import java.util.Scanner;

public class RegularEx {
	
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Customer[] coustomer= new Customer[3];
	//Customer obj= new Customer();
	for (int i=0; i<3 ; i++) {
		{
			coustomer[i]=new Customer();
		
	
	System.out.println("Enter the cust id ");
	//obj.setCustomerId(scan.next());
	coustomer[i].setCustomerId(scan.next());
	 if(!(coustomer[i].getCustomerId().matches("\\d{5}_(FS|TD|IN)"))) {
		 System.out.println("Invalid format");
	 }else {
		 
	System.out.println("Enter the  name ");
	coustomer[i].setCustomerName(scan.next());
	if(!(coustomer[i].getCustomerName().matches("[A-Z]{1}[a-z,A-Z]{7}"))) {
		System.out.println("Valid name pls!!!!");
		
	}
		else
		{
     System.out.println("Mobile no");
     coustomer[i].setMobileNo(scan.next());
     if(!(coustomer[i].getMobileNo().matches("[0-9]{10}"))) {
 		 System.out.println("Valid num pls!!!!");
     }
     else {
    	 
     
     System.out.println("Enter email id");
     coustomer[i].setEmailId(scan.next());
     if(!(coustomer[i].getEmailId().matches("[A-Z,a-z,0-9]{5}[@]{1}[A-Z,a-z,0-9]{5}[.]{1}[a-z,A-Z]{3}"))) {
 		 System.out.println("Valid email pls!!!!");
    
	}
	}

		
	
	}		  
}
		}	
}
	
	for(int i=0;i<3;i++) {
		 System.out.println( coustomer[i].getCustomerId() + coustomer[i].getCustomerName() + coustomer[i].getMobileNo() + coustomer[i].getEmailId());
		
	}
	}
}
