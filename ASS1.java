package cap.org.day4demo;

import java.util.Arrays;


public class ASS1 {
	


    public static void main(String[] args) {
    	
    	String original = "AlphabetSoup";
        char[] chars = original.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        System.out.println(sorted);
    			
    }


}
