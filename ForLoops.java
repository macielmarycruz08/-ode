// Name: Marycruz Maciel
// Date: 11/30/2022
// File Name: ForLoops.java
// Description: Add/change something to the code & comment the changes.

import java.util.Scanner;
public class ForLoops 
{
 public static void main(String[] args)
 {  
  // IF YOU KNOW HOW MANY TIMES THE LOOP WILL HAPPEN...
  // ... USE A FOR LOOP
  // i++; same as i+=1; same as i=i+1
  //   start = 0  stop = 5  step = 1
  for (int i = 0;  i < 5;   i++)
  {
   System.out.println("i = " + i);
  }
  
  // i += 2; ...same as i = i +2
  //    start = 0   stop = 8   step = 2
  for (int i = 0;   i <= 8;    i += 2) // i=0,2,4,6,8
   System.out.println("i = " + i); // statement
  // if there is a single statement under the for(), 
     // the {} are optional
  
  // start = 4 stop = 0 step = -1 ... 
  // a--; same as a-=1; same as a = a-1
  for(int a = 4; a >= 0; a--) // a=4,3,2,1,0
   System.out.println("a = " + a);
  // if there is a single statement under the for(), 
  // the {} are optional
  
  // b=-2; is the same as b = b-2;
  for(int b = 4;  b >= 0;  b-=2) // index = 4,2,0
   System.out.println("b = " + b);
  // if there is a single statement under the for(), 
  // the {} are optional    
  
  // find the smalles value of the values entered
  // find sum, average
  Scanner sc = new Scanner(System.in);
  System.out.print("How many times to repeat the loop:");
  int stop = sc.nextInt();
  double num, largest = Double.MAX_VALUE, sum = 0;
  //			^^ Replaced 'smallest' to largest value 

  // a loop that happens as many times as teh user wants to
  for(int i = 1; i <= stop; i++)
  {
   System.out.print("Please enter number " + i + ":");
   num = sc.nextDouble();
   sum = sum + num; // sum += num;
   
   // 1) Make smallest equal to the first number 
   if(i == 1)// true the first time we go through the loop
    largest = num; 
    //^^^ replaced 'smallest' to largest
   
   // 2) Compare smallest to all other numbers after the first
   else 
   { 
    // 2b) If any other number is smaller.. // Changed to largest value
    if(num > largest)
     // 2c) ...that is your new smallest // Changed smallest to largest value 
     largest = num;  
   }   
  }

  System.out.println("sum = " + sum + ", avg = " + 
                   sum/stop + ", largest = " + largest); 
  //							^^^ Asked to print the sum, avg, and largest value from both inputs
 }
}
/*
Marycruzs-Air:Week3A.1 marycruzmaciel$ javac ForLoops.java
Marycruzs-Air:Week3A.1 marycruzmaciel$ java ForLoops
i = 0
i = 1
i = 2
i = 3
i = 4
i = 0
i = 2
i = 4
i = 6
i = 8
a = 4
a = 3
a = 2
a = 1
a = 0
b = 4
b = 2
b = 0
How many times to repeat the loop:2
Please enter number 1:1
Please enter number 2:2
sum = 3.0, avg = 1.5, largest = 2.0
*/