import java.util.*;

public class Main {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		int set = 1;
		while(sc.hasNextLine()){
			int n = sc.nextInt();
			if (n == 0)
				break;
			readNumbers(n, set);
			System.out.println("\n");
			set++;
		}

	}

	private static void readNumbers(int n, int set) {
		List<Integer> numList = new ArrayList<Integer>();
		
		for (int i=0; i < n ; i++){
			int temp = sc.nextInt();
			numList.add(temp);
		}
		
		Collections.sort(numList);
		int min = numList.get(0);
		int max = numList.get(numList.size()-1);
		int range = Math.abs(min - max);
		
		System.out.println("Data Set " + set + " has range = " + range);
		
	}

}