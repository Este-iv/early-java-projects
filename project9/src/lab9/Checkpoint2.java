package lab9;
import java.io.File;
import java.util.*;

public class Checkpoint2 {
	
	public static void main(String[]args){
	 
//		int[] test = {3, 4, 5, 1, 2, 3, 2}; 
//	    int result = divideAndConcer(test,0,test.length-1);
//	    System.out.println(result);
	     
//	    String rootDirectory = ".";
//	    listAllFiles(new File(rootDirectory));
	    
	    String rootDirectory = ".";
	    System.out.println(findFile(rootDirectory));
	 
	    
}
	/**
	 * 
	 * @param arr
	 * @param start
	 * @param end
	 * @return
	 * 
	 * Checkpoint two part 1 out of three. 
	 */
	
	private static int divideAndConcer(int[] arr, int start, int end){
		 if (start == end)
		    {
		      return arr[start];
		    }
		    else
		    {
		      int mid = (start + end) / 2;
		      int leftMax = divideAndConcer(arr, start, mid);
		      int rightMax = divideAndConcer(arr, mid + 1, end);
		      return Math.max(leftMax,rightMax);
		    } 
		 
	}
	/**
	 * 
	 * @param f
	 * @return
	 * Checkpoint two part 2 out of 3 
	 */
	 public static void listAllFiles(File f)
	  {
		 System.out.println(countBytes(f));
	  }
	public static long countBytes(File f )
	{
		long k = 0;  
		
		if (!f.isDirectory())
    {
	      // Base case: f is a file, so just print its name
	      //System.out.println(f.getName());
	      k += f.length();
	    }
	    else
	    {
	      // Recursive case: f is a directory, so go through the 
	      // files and directories it contains, and recursively call
	      // this method on each one
	     // System.out.println("+ " + f.getName());
	      File[] files = f.listFiles();
	      for (int i = 0; i < files.length; ++i)
	      {
	        countBytes(files[i]);
	        k += f.length();
	      }
	    }
		return k;
		
	}
	/**
	 * Checkpoint 2 part 3 out of 3 
	 */
	public static ArrayList<String> findFiles(File file)
	  {
	    // create an empty array list...
	    ArrayList<String> arr = new ArrayList<String>();
	    
	    // pass it into the recursive method
	    findFilesRec(file, arr);
	    
	    // and return the filled-up ArrayList
	    return arr;
	  }

	  // recursive helper method
	  private static void findFilesRec(File file, ArrayList<String> list)
	  {
		if(file.isDirectory()){
			File[] files = file.listFiles();
			for(int i = 0; i < files.length; i++ ){
				findFilesRec(files[i],list);
			}
		}else {
				if (file.getName().endsWith(".Java")){
					list.add(file.getName());
				}
			}
	  }
}
	  
	

