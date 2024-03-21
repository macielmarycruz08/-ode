//Name: Marycruz Maciel
//11-28-2022
//Program Name: Switches.java
//To compile in the terminal: javac Switches.java
//To run in the terminal: java Switches
//Description: insert switch, an alternative of else if, 
//with the necessary  modificiations of default and break 
//for the exercise of school grades

import java.io.*;

class SwitchExample
{
  public static void main(String[] args)
  throws IOException
  {
    int code, status;
    String s1, year;
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.print("Enter code (1,2,3,4,5,6): ");
    s1 = br.readLine();
    code = Integer.parseInt(s1);

    switch(code)
    {
      case 1:
      System.out.println("Freshman");
      break; 
      case 2:
      System.out.println("Sophmore");
      break;
      case 3:
      System.out.println("Junior");
      break;
      case 4:
      System.out.println("Senior");
      break;
      case 5:
      System.out.println("Master Program");
      break;
      case 6:
      System.out.println("Doctoral Program");
      break;
      default:
      System.out.println("Wrong code entered");
    }   
  }
}

/* 
Marycruzs-Air:Week2c.1 marycruzmaciel$ javac SwitchExample.java
Marycruzs-Air:Week2c.1 marycruzmaciel$ java SwitchExample
Enter code (1,2,3,4,5,6): 1
Freshman
Marycruzs-Air:Week2c.1 marycruzmaciel$ java SwitchExample
Enter code (1,2,3,4,5,6): 2
Sophmore
Marycruzs-Air:Week2c.1 marycruzmaciel$ java SwitchExample
Enter code (1,2,3,4,5,6): 3
Junior
Marycruzs-Air:Week2c.1 marycruzmaciel$ java SwitchExample
Enter code (1,2,3,4,5,6): 4
Senior
Marycruzs-Air:Week2c.1 marycruzmaciel$ java SwitchExample
Enter code (1,2,3,4,5,6): 5
Master Program
Marycruzs-Air:Week2c.1 marycruzmaciel$ java SwitchExample
Enter code (1,2,3,4,5,6): 6
Doctoral Program
*/