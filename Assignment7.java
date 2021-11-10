import java.util.Scanner;
public class Assignment7mb
{
  public static void main (String [] args)
  {
    Scanner k = new Scanner(System.in);
    String choice1, choice1a, choice1b;
    
    System.out.println("What the dog doin?(Eating Ravioli or hanging out with the cat on the couch?)");
    choice1 = k.next ();
    
    if(choice1.equalsIgnoreCase("eating Ravioli"))
    {
      System.out.println ("Does the dog like it?");
      choice1a = k.next();
      if (choice1a.equalsIgnoreCase("yes"))
      {
        System.out.println("I wonder if thats normal....");
      }
      else if (choice1a.equalsIgnoreCase("no"))
      {
        System.out.println("that's too bad. /:");
      }
  else
  {
    System.out.println("Sorry, that was not an option, try again");
  }
    }
    else if (choice1.equalsIgnoreCase ("Hanging out with the cat on the couch"))
    { 
      System.out.println("Are they friends?");
      choice1b = k.next();
      if (choice1b.equalsIgnoreCase ("no"))
      {
        System.out.println("the dog better watch out. cats have shrp claws.");
      }
      else if (choice1b.equalsIgnoreCase ("yes"))
      {
        System.out.println("awe, love to see it!");
      }
      else
     {
       System.out.println("That was not one of the options, try again.");
     }
   }
  }
}