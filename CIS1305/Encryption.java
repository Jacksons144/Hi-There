//Replace each digit with the result of adding 7 to the digit and getting the remainder after dividing the new value by 10. 
//Then swap the first digit with the third, and swap the second digit with the fourth. 
//Then print the encrypted integer. 
import java.util.Scanner;

public class Encryption{

	public static void main(String [] args){
		Scanner scnr = new Scanner(System.in);
		int realNumber,
		numT,
		numH,
		numTen,
		numOne;
		
		System.out.println("Enter the four digit number.");
		realNumber = scnr.nextInt();
		
		numT = realNumber / 1000;
		numT = numT + 7 % 10 + 10;//numT needs to end up in the 10's spot... hence the +10
		
		numH = realNumber % 1000 / 100;
		numH = numH + 7 % 10;
		
		numTen = realNumber % 100 / 10;
		numTen = numTen + 7 % 10 + 1000;//numTen needs to end up in the 1000's spot... hence the +1000
		
		numOne = realNumber % 10;
		numOne = numOne + 7 % 10 + 100;//numOne needs to end up in the 100's spot... hence the +100
		
		realNumber = numT + numH + numTen + numOne;
		System.out.print("Encrypted number: " + realNumber);
		
	}//end main method

}//end public class