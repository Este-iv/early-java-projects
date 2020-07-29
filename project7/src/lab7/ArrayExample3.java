package lab7;

import java.util.*;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample3 {
	public static void main(String[] args) {
		// String s = "3 5 7 9 12";
		// int[] result = readNumbers(s);
		// System.out.println(Arrays.toString(result));
		
		int[] test = { 1, -2, 3, -4, 5, -6, 6, -7 };
		System.out.println(Arrays.toString(getPosiviteNumbers(test)));
		System.out.print(Arrays.toString(randomExperiment(10,1000)));
		int [] array = {1,2,3,4,5,6,7,8,9};
	    switchHalves(array);
		System.out.print( Arrays.toString(array));

		
		
		
	}

	public static int[] readNumbers(String text) {
		Scanner scanner = new Scanner(text);
		int count = 0;
		while (scanner.hasNextInt()) {
			scanner.nextInt();
			count += 1;
		}

		int[] nums = new int[count];
		scanner = new Scanner(text);
		int index = 0;
		while (scanner.hasNextInt()) {
			int num = scanner.nextInt();
			nums[index] = num;
			index += 1;
		}
		return nums;
	}

	public static int[] getPosiviteNumbers(int[] numbers) {
		//int[] temp = new int[numbers.length];
		int counter = 0 ; 
		for (int i = 0; i < numbers.length ; i++) {
			// int check =
			if (numbers[i] >= 0) {
				counter ++; 
			}
		}
		int [] temp = new int [counter];
		counter = 0;
		for( int j = 0; j < numbers.length; j++)
		{
			if (numbers[j] >= 0){
			temp[counter] = numbers[j];
			counter ++;
		}
		}
		return temp;
	}
	public static int[] randomExperiment(int max, int iters)
	{
		Random ran = new Random();
		 
		 int result; 
		 
		
		
		int [] count = new int[max];	
		for (int i = 0; i < iters; i++){
		 result = ran.nextInt(max);
		 
		 count[result]++; 
		
		}
		
		
		return count;
		
	}
	
	public static void switchHalves( int [] numbers){

		int mid = numbers.length /2; 
		
		for(int i = 0; i < mid; i++ ){
			int temp = numbers[i];
			numbers[i] = numbers[mid +i+1];
			numbers[mid +i+1] = temp;
			
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}