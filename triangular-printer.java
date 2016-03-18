import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int num = sc.nextInt();
			drawTriagle(num);
			System.out.print('\n');
		}
		

	}

	private static void drawTriagle(int num) {
		while(num >0){
			printRowStars(num);
			num--;
		}
	}

	private static void printRowStars(int num) {
		for(int i=0; i<num; i++){
			System.out.print('*');
		}
		System.out.print('\n');
	}



}
