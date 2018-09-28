package cap.org.day4demo;
import java.util.Scanner;

public class ASSG2 {
		String LetterCapitalize(String str) {
			StringBuilder output = new StringBuilder();
			String[] arr = str.split(" ");
			for (String s : arr) {			
				if (output.length() > 0) {
					output.append(" ");
				}
				
				output.append(s.substring(0, 1).toUpperCase() + s.substring(1));
			}

			return output.toString();

		}

		public static void main(String[] args) {
			ASSG2 c = new ASSG2();
			System.out.print(c.LetterCapitalize("This is java world . Where we learn classes and objects."));
		}
	}