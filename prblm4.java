package day2demo.org.cap.demo2;

import java.util.Scanner;

public class prblm4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Enter the string: ");
		str=sc.next();
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}
		sc.close();
	}

}