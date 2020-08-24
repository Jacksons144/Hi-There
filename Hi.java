import java.util.Scanner;

public class Hi
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		char letter = line.charAt(1);
		System.out.println(letter);


	}
}