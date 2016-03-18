import java.util.*;

public class Main {

	private static 	HashMap<String, String> dic = new HashMap<String, String>();
	
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			String word = sc.nextLine();
			word = word.toLowerCase();
			if(word.equals("----")){
				break;
			} else {
				dic.put(word, word);
			}
		}
		
		
		while(sc.hasNextLine()){
			String line = sc.nextLine();
			correctLineMisPelt(line);
		}
		
	}

	private static void correctLineMisPelt(String line) {
		String[] words = line.split(" ");
		for (int i = 0; i < words.length; i++){
			String word = words[i];
			if(dic.containsKey(word.toLowerCase())){
				System.out.print(word);
			} else {
				System.out.print("?" + word + "?");
			}
			
			if (i < words.length -1)
				System.out.print(" ");
			else
				System.out.print("\n");
		}
	}

}
