import java.util.Scanner;
public class Assignment5mb
{
  public static void main(String [] a)
  {
    Scanner k = new Scanner (System.in);
    System.out.println ("Enter the name of someone you know:");
    //requests name
    String n = k.nextLine();
    //attaches name to variable n
    System.out.println ("Enter your favorite colour:");
    String c = k.nextLine();
    System.out.println ("Enter your favorite food:");
    String f = k.nextLine();
    System.out.println ("Enter your favorite animal:");
    String z = k.nextLine();
    System.out.println ("");
    System.out.println ("I had a dream that " + n + " ate a " + c + z);
    System.out.println ("and it tasted like " + f);
  }
}
