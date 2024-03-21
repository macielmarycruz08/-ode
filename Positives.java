import java.util.Scanner;
class Positives
{
  public static int countEven()
  {
    int value = 0, count = 0;
    Scanner keyboard = new Scanner(System.in);
    
    System.out.print("Please enter value, enter 0 to stop:");
    value = keyboard.nextInt();

    while (value != 0)
    {
      if (value %2 == 0)
        count++;
      
      System.out.print("Please enter value, enter 0 to stop:");
      value = keyboard.nextInt();
    }
    
    return count;
  }

  public static void main(String args[])
  {
    // call method that returns a value
    /*int numPositives = countPositive(); */// call method that returns a value
    int numEven = countEven();
    /*System.out.println("There are " + numPositives + " positive values");*/
    System.out.println("There are " + numEven + "even numbers");
  } 
  
} // end class Positives      
      