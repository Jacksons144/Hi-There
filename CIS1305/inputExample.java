import java.util.Scanner;



public class InputExample {

   public static void main(String [] args) {

      Scanner scnr = new Scanner(System.in);

      int birthMonth;

      int birthYear;



      System.out.println("Enter your birth month")

      birthMonth = scnr.nextInt();


      
System.out.println("Enter your birth year");

      birthYear = scnr.nextInt();


      
      System.out.println(birthMonth + "/" + birthYear);


   }

}