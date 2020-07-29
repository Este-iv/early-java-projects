package lab4;

import java.util.Scanner;

public class NumberPower
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int first = getNum(input);
		int second = getNum(input);
		
		int result = (int)Math.pow(first, second); 
		System.out.println(result);
	
	}
	public static int getNum(Scanner input)
	{
		
		System.out.print("Enter a Number: ");	
		
		if(input.hasNextInt())
		{
		
		int next = input.nextInt();
		return next;
		}
		else
		{
			input.next();
			return 1;
		}
		
	}

}
