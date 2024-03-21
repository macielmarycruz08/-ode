// Name: Marycruz Maciel
// Date: 11/30/2022
// File Name: Repetition.java
// Description: Add/change something to the code & comment the changes.

public class Repetition 
{
  public static void main(String[] args) 
  {
    int stop = 40; //Changed the value to 40 
    int start = 2; // Changed the start value to 2
    int increment = 4; //Changed the increcement number to 4
    double celsius;
    double fahren;
    
    System.out.println("Degrees  Degrees");
    System.out.println("Celsius  Fahrenheit");    
    
    celsius = start;
    while(celsius <= stop)
    {
      fahren = (9.0/5.0) * celsius + 32.0;
      System.out.printf("%2.0f       %-5.2f \n", 
                         celsius, fahren);
      celsius = celsius + increment;
    }   
  }
}

/*
Marycruzs-Air:Week3A.1 marycruzmaciel$ javac Repetition.java
Marycruzs-Air:Week3A.1 marycruzmaciel$ java Repetition
Degrees  Degrees
Celsius  Fahrenheit
 2       35.60 
 6       42.80 
10       50.00 
14       57.20 
18       64.40 
22       71.60 
26       78.80 
30       86.00 
34       93.20 
38       100.40 
*/