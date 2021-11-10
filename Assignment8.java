import java.util.Random;
public class Assignment8mb
{
  public static void main ( String[] args )
  {
    Random r = new Random();
    
    
    
    System.out.println("ROLL THE DICE!");
    int x = 1 + r.nextInt(6);
    int y = 1 + r.nextInt(6);
    System.out.println("Roll #1: " + x);
    System.out.println("Roll #2: " + y);
    
    int sum = x + y;
    
    System.out.println("The total is " + sum + "!");
   
  }
}