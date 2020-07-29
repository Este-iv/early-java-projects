package lab8;
import java.awt.Point;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import plotter.Plotter;
import plotter.Polyline;



public class HelloPlot {

	
	public static  ArrayList<Polyline> readfile(String file) throws FileNotFoundException
	{
			ArrayList<Polyline> test = new ArrayList<Polyline> () ;
			File inFile = new File(file);
			Scanner in = new Scanner(inFile);
			while(in.hasNextLine())
			{
				String line = in.nextLine();
				line.trim();
				if(line.startsWith("#")|| line.length() == 0 )
				{
					//does nothing
				}
				else{
				Polyline  p = Helper(line);
				test.add(p) ; 
				}
			}
			
			return test;
			
	}
	private static Polyline Helper(String line)
	{
		Scanner parse = new Scanner(line); 
		int w = 1 ; 
		if( parse.hasNextInt())
		{
			w = parse.nextInt();
		}
		
		String color = parse.next(); 
		Polyline p = new Polyline(color, w);
		while(parse.hasNextInt() )
		{
			int x = parse.nextInt();
			int y = parse.nextInt();
			p.addPoint(new Point(x,y));
		}
		return p ; 
	}
	
	public static void main(String[] args) throws FileNotFoundException
	{
		Plotter plotter = new Plotter();
		ArrayList<Polyline> q = readfile("U:\\CS227\\workspace\\project8\\hello.txt");
		for(int i = 0; i < q.size(); i++ )
		{
			plotter.plot(q.get(i));
		}
		

	}

}
