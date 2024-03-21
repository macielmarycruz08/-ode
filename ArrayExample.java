// Name: Marycruz Maciel
// Date: 12/02/2022
// File Name: ArrayExample.java
// Description: Type up both sample programs below in one ArrayExample.java file and get //             them to work. 
import java.util.Scanner;

class ArrayExample
{
  public static void main(String[] args)
  {
    int numgrades;
    int grades [];
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter the amount of grades you want");
    //                ^^ Chnaged the message (prompt)
    numgrades = keyboard.nextInt();
    grades = new int[numgrades];

    System.out.println("Created a  " + numgrades + " integer array.");
    System.out.println("The values in the array are initialized to:");
    for (int i = 0; i < numgrades; i++)
      System.out.println("grades["+ i +"]=" + grades[i]);
    //                            ^^^ included spaces

    int myArray[] = new int[4];
    for (int i = 0; i < myArray.length; i++)
    {
      System.out.print("Enter array value " + (i+1) +":");
      myArray[i] = keyboard.nextInt();
    }

    System.out.println("Array forward:");
    for (int i = 0; i < myArray.length; i++)
      System.out.println("myArray[" + i + "]=" + myArray[i] );

    System.out.println("Array backward:");
    for (int i = myArray.length-1; i >= 0; i--)
      System.out.println("myArray[" + i + "]=" + myArray[i] );
    // Combine both programs together
  }
}
/*
Marycruzs-Air:Week5b marycruzmaciel$ javac ArrayExample.java
Marycruzs-Air:Week5b marycruzmaciel$ java ArrayExample
How many grades do you want to enter?3
Created a  3 integer array.
The values in the array are initialized to:
grades[0]=0
grades[1]=0
grades[2]=0
Enter array value 1:2
Enter array value 2:4
Enter array value 3:6
Enter array value 4:7
Array forward:
myArray[0]=2
myArray[1]=4
myArray[2]=6
myArray[3]=7
Array backward:
myArray[3]=7
myArray[2]=6
myArray[1]=4
myArray[0]=2 
*/
