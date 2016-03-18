import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line;
		
		
		while(sc.hasNextLine()){
			line = sc.nextLine();
			String[] words = line.split(" "); 
			String word = words[0];
			if (isPalindrome(word))
				System.out.println(word);
		}
	}

	private static boolean isPalindrome(String word) {
		
		char[] chars = word.toCharArray();
		int pfc = 0;
		int plc = chars.length -1;
		while (pfc != plc){
			if (pfc + 1 == plc)
				return true;
			
			if (chars[pfc] != chars[plc])
				return false;
			pfc++;
			plc--;
		}
		
		return true;
	}

}
