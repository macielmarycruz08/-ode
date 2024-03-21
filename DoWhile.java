// Name: Marycruz Maciel
// Date: 11/30/2022
// File Name: DoWhile.java
// Description: Add/change something to the code & comment the changes.

import java.util.Scanner;
public class DoWhile 
{
  public static void main(String[] args)
  {
    String message;
    message = "Invalid age, enter another value b/w 0-123: ";
    Scanner sc = new Scanner(System.in);
    
    // INPUT VALIDATION ...
    // ... make sure the user enters a good value for age 
    int age = 10; 
    // good age so loop won't happen
    while (age < 0 || age > 120)  //Changed the max age 
    {
      System.out.print(message);
      age = sc.nextInt();
    }
    
    // do-while loop is a loop that happens at least one time
    age = 10; // good age, but the loop will still happen
    do
    {
      System.out.print("Enter another value b/w 0-123:"); // added ":" before closing the message for a better formating output 
      age = sc.nextInt();
    } while (age < 0 || age > 120); //Chnaged teh max age
  }
}
/*
Marycruzs-Air:Week3A.1 marycruzmaciel$ javac DoWhile.java
Marycruzs-Air:Week3A.1 marycruzmaciel$ java DoWhile
Enter another value b/w 0-123:3
Marycruzs-Air:Week3A.1 marycruzmaciel$ java DoWhile
Enter another value b/w 0-123:-11
Enter another value b/w 0-123:200
Enter another value b/w 0-123:100
*/