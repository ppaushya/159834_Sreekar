package cap.org.day4demo;
import java.util.Scanner;

public class ASSG5 {
	
		 	public static void main(String[] args) {
			// TODO Auto-generated method stub
	        String Str;
	       Scanner s=new Scanner(System.in);
	       System.out.println("Enter string");
	       Str=s.nextLine();
	       char[] arr=new char[Str.length()];
	       for(int i=0;i<Str.length();i++)
	       {
	           arr[i]=Str.charAt(i);
	       }
	       for(int j=0;j<=Str.length()-1;j++)
	       {
	           arr[j]=(char)(arr[j]+1);
	       }
	       System.out.println("new is: ");
	       for(int i=0;i<Str.length();i++)
	       {
	          System.out.print(" "+arr[i]);
	       }
	       System.out.println();
	       for(int j=0;j<=Str.length()-1;j++)
	       {
	           if(arr[j]=='a'||arr[j]=='e'||arr[j]=='i'||arr[j]=='o'||arr[j]=='u')
	           arr[j]=(char)(arr[j]-32);
	       }
	 
	        for(int i=0;i<Str.length();i++)
	       {
	          System.out.print(" "+arr[i]);
	       }
	 
	    }
	 
		}
	 	

}
