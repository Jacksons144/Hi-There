import java.util.Scanner;

public class BMI
{
	public static void main(String [] args)
	{
		double height,
		weight,
		bmi;
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter your height in inches");
		height = scnr.nextInt() * 2.5;
		height = height * height;
		
		System.out.println("Enter your weight in pounds");
		weight = scnr.nextInt() * .45;
		bmi = weight / height * 703;
		
		System.out.println("Your BMI is " + bmi);
		
	}//End string

} //end class BMI