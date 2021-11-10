import java.util.Scanner;
public class Project1mb
{
  public static void main (String [] args)
  {
    Scanner k = new Scanner(System.in);
    
    System.out.println("Halloween is coming! Let's venture through a haunted forest!");
    System.out.println("You are going on a walk with your 3 friends in a supposedly haunted forest.");
    System.out.println("leaves crunch each step as you walk deeper into the forest.");
    System.out.println("you come to a split in the path, your choice. (left or right?)");
    
   //choice 1 left
    String choicelorr = k.next();
    if(choicelorr.equalsIgnoreCase("left"))
    {
      System.out.println("You chose left. Trees creak, crows caw, the sky Darkens.");
      System.out.println("within the trees you spot the perfect place to camp out and make a fire.");
      System.out.println("But there is sure to be more to explore!");
      System.out.println("(camp or explore?)");
    }
      
        //choice 1aa camp
          String choice1a = k.next();
          if (choice1a.equalsIgnoreCase("Camp"))
         {
          System.out.println("You and your friends start gathering sticks to create a fire.");
          System.out.println("A friend lights the fire.");
          System.out.println("You hear a rustling in the tree's");
          System.out.println("(investigate or ignore)");
         }
            //choice 1aa investigate
          String choice1aa = k.next();
          if (choice1aa.equalsIgnoreCase("investigate"))
          {
           System.out.println("You ignore the ruslting");
           System.out.println("suddenly the air goes cold and you shudder.");
           System.out.println("Something feels off...");
           System.out.println("'Did you guys hear that!? something just wispered in my ear!' exclaimes a friend");
           System.out.println("'Did anyone else feel that sudden cold?' you ask.");
           System.out.println("'You dont think it could be a gho-' your friend is interupted by a sudden realization.");
           System.out.println("The fire extinguishes on its own and you find yourself lost trying to adjust to the darkness.");
           System.out.println("You're suddenly all alone in the darkness with no path to be found...");
           System.out.println("You're lost.");
           System.out.println("Ending 1/8");
          }
           
           //choice 1aa ignore
          if (choice1aa.equalsIgnoreCase("ignore"))
          {
           System.out.println("You creep towards the edge of the open area and peek behind a bush.");
           System.out.println("You jump back startled for it to just be a pheasant.");
           System.out.println("Nothing happens the rest of the night and eventually,");
           System.out.println("You all go home.");
           System.out.println("Ending 2/8");
          }
           
       //choice 1a explore
          else if (choice1a.equalsIgnoreCase("Explore"))
         {
          System.out.println("You venture deeper within the woods");
          System.out.println("One of your friends shakes a tree and bats come flying out!");
          System.out.println("Are you scared?");
          System.out.println("y or n");
         }
          
          //choice 1ab
          String choice1ab = k.next();
          if (choice1ab.equalsIgnoreCase("y"))
          {
           System.out.println("You jump and all of you run back where you came.");
           System.out.println("Ending 3/8");
          }
           
           //choice 1ab 
          if (choice1ab.equalsIgnoreCase("n"))
          {
           System.out.println("You give a slight jump and continue on your way.");
           System.out.println("You continue to get deeper and deeper in the woods");
           System.out.println("never finding your way back.");
           System.out.println("Ending 4/8");
          }
     //invalid
      else
      {
        System.out.println("That was not one of the options, try again.");
      }
  {
    //choice lorr right
    if (choicelorr.equalsIgnoreCase ("right"))
    { 
      System.out.println("You chose right. You continue to walk.");
      System.out.println("There's another split in the path.");
      System.out.println("A couple of your friends run into the path to the right excited over the more rough path.");
      System.out.println("The path to the left looks safe and well traveled.");
      System.out.println("Go together down the spooky rough path or go the safer looking way?");
      System.out.println("(rough or safe?)");
    }
      
        //choice 1b rough
    String choice1b = k.next();
         if (choice1b.equalsIgnoreCase ("rough"))
         {
          System.out.println("All 4 of you continue down the rough path almost tripping over rocks,");
          System.out.println("Dodging branches and getting scratches from thorns.");
          System.out.println("The path ends at an open area. Sticks tied together with ropes form crosses.");
          System.out.println("The hand of a skeleton breaks through the grass and grips your foot.");
          System.out.println("You could grab a treee branch and hold on or try shaking it off");
          System.out.println("(hold or shake)");
         }
             //choice 1ba
         String choice1ba = k.next();
           if (choice1ba.equalsIgnoreCase ("hold"))
           {
           System.out.println("You grab hold of a tree branch and it breaks!");
           System.out.println("You're pulled to the ground by the emerging skeleton.");
           System.out.println("Everything goes black");
           System.out.println("(Ending 5/8)");
           }
           
             //choice 1ba 
           if (choice1ba.equalsIgnoreCase ("shake"))
           {
             System.out.println("Ypu try shaking off the skeleton and the bones break apart.");
             System.out.println("The bones grabbing your ankle lose grip and you and your friends escape!");
             System.out.println("(Ending 6/8)");
           }
           
        //choice 1b safe
         else if (choice1b.equalsIgnoreCase ("safe"))
         {
          System.out.println("quickly the 'safe' path doesn't feel so safe.");
          System.out.println("Violent growls erupt from the bushes all around.");
          System.out.println("You need to get away");
          System.out.println("(sprint or creep?)");
         }
            //choice 1bb sprint
         String choice1bb = k.next();
            if (choice1bb.equalsIgnoreCase ("sprint"))
           {
            System.out.println("You sprint out the way you came launching yourself forward.");
            System.out.println("your speed is no match! Claws dig into you.");
            System.out.println("Huge fury paws push you to the ground with great force.");
            System.out.println("You're torn to shreds...");
            System.out.println("(7/8 endings)");
           }
             //choice 1bb creep
            else if (choice1bb.equalsIgnoreCase ("creep"))
            {
             System.out.println("You both slowly back away and you're in the clear.");
             System.out.println("That was a close call.");
             System.out.println("You message your friends and agree to leave.");
             System.out.println("(8/8 endings)");
            }
     //invalid
      else
     {
       System.out.println("That was not one of the options, try again.");
     }
   }
  }
}

        
        