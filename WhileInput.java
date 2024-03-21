// Name: Marycruz Maciel
// Date: 11/30/2022
// File Name: WhileInput.java
// Description: Rewrite WhileInput.java to display the prompt:
//              "Please type in the total number of data values to be averaged:"

import java.util.Scanner; //importing java util package 

class WhileInput 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    /*String s1, info, outMessage;
    int max = 6;
    int count;
    double num, total, average;
    
    outMessage = "This program will ask you to enter "
                                    + max + " numbers. ";*/
    System.out.println("Please type in the total number of data values to be averaged:"); //The output will ask for a number 
                                                                                          // ^ to control the number of times the while loop will be excuted 
    int stop = sc.nextInt();
    int num, smallest, sum;
    sum = 0;
    for (int i = 1; i <= stop; i++)
    {
      System.out.println("Please enter enter number" + i + ":");
      num = sc.nextInt();
      sum = sum + num;
    }
    /*System.out.println("sum = " + sum);*/
    System.out.println("Average = " + sum/stop);
  }
}
/*
Marycruzs-Air:Week3A.1 marycruzmaciel$ javac WhileInput.java
Marycruzs-Air:Week3A.1 marycruzmaciel$ java WhileInput
Please type in the total number of data values to be averaged:
3
Please enter enter number1:
3
Please enter enter number2:
5
Please enter enter number3:
2
Average = 3
*/