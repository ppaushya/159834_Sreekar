package cap.org.day4demo;
import java.util.Scanner;
import java.util.Arrays;
public class Assg7 {
		
			public static void main(String[] args) {
				// TODO Auto-generated method stub
		Scanner st=new Scanner(System.in);
		String st1=new String();
		String st2=new String();
		System.out.print("Enter 1st string");
		st1=st.nextLine();
		System.out.println("Enter 2nd number");
		st2=st.nextLine();
		int n1=st1.length();
		int n2=st2.length();
		char[] ch1=st1.toCharArray();
		char[] ch2=st2.toCharArray();
		int flag=0;
		 Arrays.sort(ch1);
		Arrays.sort(ch2);
		for(int i=0;i<n1;i++) {
			for(int j=0;j<n2;j++) {
				if(ch1[i]!=' ' || ch2[j]!=' ') {
					
					if(ch1[i]==ch2[j]) {
						flag=1;
					}
					else {
						flag=0;
					}
					
				}
			}
		}
		if(flag==1)
		System.out.println("Anagam is true");
		else
			System.out.println("anagam is not");
			
			}

		} 
		 

}
