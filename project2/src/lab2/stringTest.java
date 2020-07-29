package lab2;

public class stringTest {

	public static void main(String[] args)
	{
		String message;
		
		message = "Hello, World!";
		System.out.println(message);
		
		int theLength = message.length();
		System.out.println(theLength);
		
		char theChar = message.charAt(0);
		System.out.print(theChar);
		
		theChar = message.charAt(1);
		System.out.println(theChar);
		
		String messageUpper = message.toUpperCase();
		System.out.println(messageUpper);
		
		String messagePart = message.substring(0,5);
		System.out.println(messagePart);
		
		 String messageSwap = message.replace('o','*');
		 System.out.println(messageSwap);
		 
		
	}

}
