package lab8;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class LineNumberer {

	public static void main(String[] args) throws FileNotFoundException {
		File inFile = new File( "U:\\CS227\\workspace\\project7\\src\\lab7\\Deck.java");
//		Scanner  scan = new Scanner(System.in);
    	Scanner  scan = new Scanner(inFile);
		
		File outFile = new File("Test1.txt ");
		PrintWriter out = new PrintWriter(outFile);
		
		int lineCount = 1 ; 
		while (scan.hasNextLine())
		{

			String line = scan.nextLine();
			out.print(lineCount + " ");
			out.println(line);
			lineCount +=1 ; 
			
		}
		System.out.println("Done");
       
      scan.close();
       out.close(); 
	}

}
