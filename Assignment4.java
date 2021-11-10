import java.util.Scanner;
public class Assignment4mb
{
  public static void main(String [] a)
  { 
    //computes pythagorean theorem
    Scanner k = new Scanner(System.in);
    System.out.println("Enter values to compute Pythagorean theorem.");
    System.out.println("a:");
    double x = k.nextDouble();
    System.out.println("b:");
    double b = k.nextDouble();
    double c = x*x+b*b;
    double y = Math.sqrt(c);
    System.out.println("c = " + y);
  }
}

