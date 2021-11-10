import java.util.Scanner;
public class Assignment7bmb
{
  public static void main (String [] args)
  {
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println ("Type in the number of the month and I will display the month");
    int number = keyboard.nextInt();
    switch (number)
    {
      case 1:
        System.out.println("January");
        break;
      case 2:
        System.out.println("Febuary");
        break;
      case 3:
        System.out.println("March");
        break;
      case 4:
        System.out.println("April");
        break;
      case 5:
        System.out.println("May");
        break;
      case 6:
        System.out.println("June");
        break;
      case 7:
        System.out.println("July");
        break;
      case 8:
        System.out.println("August");
        break;
      case 9:
        System.out.println("September");
        break;
      case 10:
        System.out.println("October");
        break;
      case 11:
        System.out.println("November");
        break;
      case 12:
        System.out.println("December");
        break;
      case 13:
        System.out.println("Invalid month");
        break;
      case 14:
        System.out.println("Invalid month");
        break;
      case 15:
        System.out.println("Invalid month");
        break;
      case 16:
        System.out.println("Invalid month");
        break;
      case 17:
        System.out.println("Invalid month");
        break;
    }
  }
}