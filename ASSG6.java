package cap.org.day4demo;
import java.util.Scanner;

public class ASSG6 {
	
	 public static void main(String[] args) {
			
	        String Str;
	       Scanner s=new Scanner(System.in);
	       System.out.println("enter string");
	       Str=s.nextLine();
	       char[] arr=new char[Str.length()];
	       for(int i=0;i<Str.length();i++)
	       {
	           arr[i]=Str.charAt(i);
	       }
	        char[] revarr=new char[Str.length()];
	       for(int i=0;i<Str.length();i++)
	       {
	           revarr[i]=arr[Str.length()-i-1];
	        }
	         for(int i=0;i<Str.length();i++)
	        {
	           System.out.print(revarr[i]);
	        }
	 
	     }
	}

