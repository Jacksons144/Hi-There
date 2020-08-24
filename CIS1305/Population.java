import java.util.Scanner;

public class Population
{
	public static void main(String [] args)
	{
	long population = 7605000000l;//total population
	long growthRate = 10109;//growth rate percent
	double count = 1;//counter
	int year = 2018;//current year
	
	System.out.println ("The current population is 7.605 billion people. Here are the predictions for the next 75 years.");
		while (count <= 75) {
		
		population = population * growthRate / 10000;
		++year;
		System.out.println (year + ": " + population);
		++count;
		
		}//end while statement
	
	}//end main method
	
}//end public class