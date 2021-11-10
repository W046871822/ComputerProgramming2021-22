import java.util.Scanner;
public class Assignment6mb
  {
  public static void main (String [] a )
  {
    Scanner k = new Scanner(System.in);
    System.out.println("Welcome to the Calculator (Two numbers only)");
    System.out.println("Please enter your first number:");
    double b = k.nextDouble();
    System.out.println("Please enter your second number:");
    double c = k.nextDouble();

    System.out.println("What operation would you like to do?");
    System.out.println("(multiply, divide, add, subtract):");
    String operation = k.next();
    if (operation.equalsIgnoreCase("multiply"))    
    {
    double multiply = b * c;
    System.out.println(b + " * " + c + " = " + multiply);
    }
    else if (operation.equalsIgnoreCase("divide"))
    {
    double divide = b / c;
    System.out.println(b + " / " + c + " = " + divide);
    }
    else if (operation.equalsIgnoreCase("add"))    
      
    {
    double add = b + c;
    System.out.println(b + " + " + c + " = " + add);
    }
    else if (operation.equalsIgnoreCase("subtract"))
    {
    double subtract = b - c;
    System.out.println(b + " - " + c + " = " + subtract);
    }

System.out.println("Thank you.");
  }
}
