package lab3;
import java.util.*;
public class RabbitModel 
{
private int population ; 
private int LastYear;
private int yearBefore;
	
	Random rand = new Random();
	
	/**
	 * Rabbit model Constructor 
	 */
	public RabbitModel()
	{
		population = 0;
		LastYear = 1;
		yearBefore = 0;
				
		
		
		//population = rand.nextInt(10);
	}

	/**
	 * gets the Population of the Rabbits 
	 * @return
	 */
	public int getPopulation() 
	{
		
		return population;
	}
	
	/**
	 * Simulates a year for the Rabbit growth
	 */
	public void simulateYear() 
	{

		//		population += rand.nextInt(10) ;
		population = LastYear + yearBefore;
		yearBefore = LastYear;
		LastYear = population;
		
		
		
	}
	
	/*
	 * Resets the Program back to original #'s
	 */
	public void reset() 
	{
		population = 0; 
		LastYear = 1;
		yearBefore = 0;
		
	}

}
