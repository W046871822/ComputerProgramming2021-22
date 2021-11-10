import java.util.Scanner;
public class Assignment9mb
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    int num = 8;
    
    System.out.println("I have chosen a nmber between 1 and 10. Try to guess it.");
    int entry = keyboard.nextInt();
      
    while (entry != num)
{
  System.out.println("\nThat is incorrect. Guess Again.");
      entry = keyboard.nextInt();
    }
      
      System.out.println("\nThat's right! You're a good guesser.");
    
  }
}
    
    