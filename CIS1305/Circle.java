import java.util.Scanner;

public class Circle {
	public static void main(String args[]) {
		Scanner scnr = new Scanner(System.in);
		int radius;
		int diameter;
		double circumference;
		double area; 
		
	System.out.println("Enter radius of circle.");
		radius = scnr.nextInt();
		
	System.out.println("Diameter:");
		diameter = radius * 2;
	System.out.println(diameter);

	System.out.println("Circumference:");
		circumference = 2 * 3.14 * radius;
	System.out.println (circumference);

	System.out.println("Area:");
		area = 3.14 * radius * radius;
	System.out.println (area);

	}
}

