// Marycruz Maciel
// 11/28/2022
// Description:  Scanner sample program
// File name: NumsScanner.java
// To Compile in terminal type:  javac NumsScanner.java
// To Run in terminal type: java NumsScanner

import java.util.*; // needed to access the Scanner class

public class NumsScanner
{
  public static void main (String[] args)
  {
    double num1;

    //With Scanner,
    //we can enter a numerical value without parsing it:
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a numerical value:"); 
    //                ^^^^^ Changed the message

    num1 = sc.nextDouble();
    System.out.println("The value you enetered is: "+ num1);
    //                   ^^^^ Changed the message
    System.out.println("By doing math we get: "+
                                num1+" * 3.14 = "+ num1*3.14);
    //                                  ^^ used pi instead of 5 

  }
}
/*
Marycruzs-Air:Week 2b.1 marycruzmaciel$ javac NumsScanner.java
Marycruzs-Air:Week 2b.1 marycruzmaciel$ java NumsScanner
Enter a numerical value:9
The value you enetered is: 9.0
By doing math we get: 9.0 * 3.14 = 28.26
*/