// Name: Marycruz Maciel
// 11-28-2022
// Description: BufferedReader, readLine() Example
// File name: ParseNums.java
// To Compile in terminal type: javac ParseNums.java
// To Run in terminal type: java ParseNums

import java.io.*; // needed to access input stream classes

public class ParseNums
{
  public static void main (String [] args)
  throws java.io.IOException // need this for readLine()
  {
    String s1;
    double num1;

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.print("Enter three words: ");                 
    //               ^^^^^^^^^^^^^^^^^^ Changed the prompt (message) 
    // Prompt is a message that tells the user what to enter
    s1 = br.readLine();

    System.out.println("The words you entered are: " + s1);
    //                  ^^^^ Changed the message to fit the first output

    System.out.print("Now enter a numerical value: ");
    //                ^^^ Changed the message to fit the first output
    s1 = br.readLine();

    // s1 is a string, we cannot do math such as "s1 = s1*s5;"
    // to convert the string to an actual numeric value, 
    // you have to PARSE it

    num1 = Double.parseDouble(s1);
    System.out.print("Now " + num1 + 
                     " is converted into a double ...\n");

    System.out.println("...and we can do math with it "+
                                         num1+" / 5 = " + (num1/5));
    //                                          ^^^ Changed the numerical value and math from multiplying to dividing
  }
}

/*
Marycruzs-Air:Week 2b.1 marycruzmaciel$ javac ParseNums.java
Marycruzs-Air:Week 2b.1 marycruzmaciel$  java ParseNums
Enter three words: Chair, Home, Sky
The words you entered are: Chair, Home, Sky
Now enter a numerical value: 16
Now 16.0 is converted into a double ...
...and we can do math with it 16.0 / 5 = 3.2
*/
