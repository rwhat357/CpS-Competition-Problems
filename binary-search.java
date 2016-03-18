package p1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args){
		
		int n1 = 1;
		int n2 = 1;
		int sum = 0;
		
		for(int i = 0; i < 10; i++){
			
			System.out.println(n1);
			sum = n1 + n2;
			n1 = n2;
			n2 = sum;
			
		}
		
		int[] list1 = {1, 2, 3, 4, 8, 5, 10, 1, 3, 4, 7, 9, 0};
		int[] list2 = {1, 10, 2};
		
		check(list1, list2);
		Arrays.sort(list1);
		encontrarDoble(list1, 10);
		
		
	}

	private static void check(int[] list1, int[] list2) {
		
		
		for(int i = 0; i < list1.length; i++ ){
			for (int j = 0; j < list2.length; j++){
				
				if (list1[i] == list2[j]){
					System.out.println("Duplicate #: " + list1[i]);
				}
			}
		}
	}
	
	private static void encontrarDoble(int[] list, int value){
		
		int lowIndex = 0;
		int highIndex = list.length - 1;
		
		while( lowIndex <= highIndex){
			
			
			int middleIndex = (lowIndex + highIndex)/2;
			
			if (list[middleIndex] > value){
				highIndex = middleIndex - 1; 
			} else if (list[middleIndex] < value){
				lowIndex = middleIndex +1;
			} else {
				System.out.println("We found a match: list[" + middleIndex + "]= " + list[middleIndex]);
				return;
			}
			System.out.println("iterating...");
			
		}
		
		
	}
	
	
	
}
