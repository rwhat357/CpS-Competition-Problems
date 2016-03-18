import java.io.*;
import java.util.*;

class Main {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		while(sc.hasNextLong()){
			
			long a = sc.nextLong();
			long b = sc.nextLong();
			System.out.println(Math.abs(a - b));
			
		}
	}

}
