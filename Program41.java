// Marycruz Maciel
// 11-28-2022
// Description: Using InputStreamReader, BufferedReader,
//    and readLine() to allow input from the user
// File Name: Program41.java
// To Compile in terminal type: javac Program41.java
// To Run the program in terminal type: java Program41

// Needed for InputStreamReader & BUfferedReader 
import java.io.*;

public class Program41
{
	public static void main(String[] args)
	throws IOException // need this for readLine()
	{
	String s1, s2, s3;
	double num1,num2, product, num3, sum;

	// set up the basic input stream 
	// needed for information to be 
	// entered infor program using the keyboard 
	InputStreamReader isr = new InputStreamReader(System.in);
	// needed for readLine()
	BufferedReader br= new BufferedReader(isr);

	//tell the user waht to enter
	System.out.print("Enter a number: ");
	// 					^^^ Prompt 
	// prompt - message that tells the user what to enter 

	// when it reaches br.readLine(),
	// the program will pause.
	// the user will type a number, press ENter, 
	// and then the program resumes

	//INput: user enters a number which is read as a string 
	s1 = br.readLine();
	// the string is converted into double 
	num1 = Double.parseDouble(s1);

	System.out.print("Enter another number: ");
	s2 = br.readLine(); //INPUT
	num2 = Double.parseDouble(s2);

	System.out.print("Enter another number: ");
	s3 = br.readLine(); //INPUT
	num3 = Double.parseDouble(s3);

	product = num1 * num2 * num3 ; //multiply the two numbers 

	System.out.println(num1 + " times " + num2 + " times " + num3 + " = " + product);
	}
}
/* 
Marycruzs-Air:Week 2b.1 marycruzmaciel$ javac Program41.java
Marycruzs-Air:Week 2b.1 marycruzmaciel$ java Program41
Enter a number: 6
Enter another number: 2
Enter another number: 3
6.0 times 2.0 times 3.0 = 36.0
*/


