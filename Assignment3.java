import java.util.Scanner;
public class Assignment3mb
{
    public static void main(String[] a)
    {
/////////////////////////////////////////////////
//  Author: Madison Boone
//  Objective:
//  The following program should be modified
//  according to the assignment statement.
//  Date: Oct 12, 2021
//  Modified: 
////////////////////////////////////////////////
//  Read the number the user enters. 
//  (Remember what changes you need to make in order to get a program to do input!)
//  Modify the sum and the multiplication calculations to include number3. 
//  Modify the output statements as appropriate.
////////////////////////////////////////////////
      Scanner k = new Scanner(System.in);
      
      
        //  Create integer variables named num1 and num2    
        int num1 = 75;
        int num2 = 137;
    
        // Create an double variable named number3.
        System.out.println("Input number:");
        double num3 = k.nextDouble();
        //include num 3 in sum and multiplication
        double sum = num1 + num2 + num3;
        double mul = num1 * num2 * num3;
        
        System.out.println("The sum of 75, 137 and your inputed number is " + sum);
        System.out.println("The three numbers multiplied equal " + mul);
        // Compute the average of num1 and num2
        double average = (num1+num2)/2.0;

        // Output the result
        System.out.println("The average of "+num1);
        System.out.println("and "+num2+" is "+average);
        //  Ask the user to enter a value for number3.
        System.out.print("Please input a number: ");
        
        
        
    }
}
