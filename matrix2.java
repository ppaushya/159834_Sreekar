package day3demo.org.cap;
import java.util.Scanner;
public class matrix2 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		int arr[][]= new int[3][3];
		System.out.println("enter the 9 values of matrix");
		 for(int i=0;i<3;i++) {
		    	for(int j=0;j<3;j++) {
		    	arr[i][j]=scan.nextInt();
		    	}
		 }
		   for(int i=0;i<3;i++) {
		    	for(int j=0;j<3;j++) {
		    		
		    		if(j>=i) 
		    		System.out.print(arr[i][j]+"\t");
		    	}
		    	System.out.println();
			}
		
		
		 }
	}


