/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 713043
 */
import java.util.Scanner;
public class ClassAverage {
    
    public static void main(String[] args){
        
        int total = 0,
                counter = 0,
                grade = 0;
        double average = 0;
        Scanner input = new Scanner(System.in);  
        
        /**
         * Prompt for the first grade
         */
        System.out.println("Enter grade (-1 to quit):");
        grade = input.nextInt();
        
        //For sentinel not being entered
        while(grade != -1){
            
            //add 1 to counter
            counter = counter + 1;
            
            //add grade to total
            total = total + grade;
            
            //prompt for next grade
            System.out.println("Enter grade (-1 to quit):");
            
            //get next grade
            grade = input.nextInt();
            
        }//end while grade != -1
        //if counter is greater than 0
        if(counter > 0){
          //calculate the average
          average = (double) total / counter;
          
          //print average
          System.out.println("The average of " + counter + " grades is " + average + ".");
        }
        
        //else print no grades were entered
        else
            System.out.println("No grades were entered.");
    }//end main
    
}//end classAverage
