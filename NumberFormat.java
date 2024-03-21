// Marycruz Maciel 
// 11-28-2022
// Description: printf sample program
// File name: NumberFormat.java
// To Compile in terminal type: javac NumberFormat.java
// To Run in terminal type: java NumberFormat.java 

// Number formatting in Java (using C++ style printf)
class NumberFormat
{ 
 public static void main (String[] args)
 {
  double num = 3.1415169265; 
//             ^^^^^^ Chaged num value to pi 
  System.out.printf("Round to 1 decimal num = %.1f\n", num);
  System.out.printf("Round to 2 decimal num = %.2f\n", num);
  System.out.printf("Round to 3 decimal num = %.3f\n", num);
                            //^^^ Chaged 2 to 3 decimal places 
  //%5.2f means
  //"Field of 5 numbers total with 2 decimal digits" 
  //|xx.xx|  the "." counts as a number

  System.out.printf("Round to 4 decimal num = %.4f\n", num);
//                            ^ Changed 3 to 4 decimal places
  System.out.printf("Round to 5 decimal num = %.5f\n", num);
//                            ^ Change 4 to 5 decimal places 
 }
}
/*
Marycruzs-Air:Week 2b.1 marycruzmaciel$ javac NumberFormat.java
Marycruzs-Air:Week 2b.1 marycruzmaciel$ java NumberFormat
Round to 1 decimal num = 3.1
Round to 2 decimal num = 3.14
Round to 3 decimal num = 3.142
Round to 4 decimal num = 3.1415
Round to 5 decimal num = 3.14152
*/