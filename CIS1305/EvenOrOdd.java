import java.util.Scanner;

public class EvenOrOdd
{
	public static void main(String args[])
	{
	Scanner scnr = new Scanner(System.in);
	int number,
	rem;

		System.out.println("Enter a number");
		number = scnr.nextInt();
		rem = number%2;
		
		if(rem == 0)
			System.out.println(number + " is even");
		if(rem != 0)
			System.out.println(number + " is odd");

	}


}