// Marycruz Maciel
// 11-28-2022
// Description:  if, else if chain - stop at the first true 
// File Name: IfElseIfChain.java
// To Compile: javac IfElseIfChain.java
// To Run: java IfElseIfChain
import java.io.*;
import java.text.*;
class IfElseIfChain
{
	public static void main(String[] args)
	throws IOException 
	{
		double grade;
		String n1; //changed s1 to n1 
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter your numerical grade: ");
	//						^^^ Changed the message

		n1 = br.readLine();
		// changed the variable s1 to n1 
		grade = Double.parseDouble(n1);

		if (grade >= 90)
		{
			/*System.out.println("The grade you've entered is a: ");*/
			//						^^^ Changed the message
			System.out.print(" The grade you've entered is an: A ");
			//						^^^ Changed the message

		}
		else if ( grade < 90 && grade >= 80)
			System.out.println("The grade you've entered is a: B");
		else if (grade < 80 && grade >= 70)
			System.out.println("The grade you've entered is a: C");
		else if (grade < 70  && grade >= 60)
			System.out.println("The grade you've entered is a: D");
		else if (grade <60)
			System.out.println("The grade you've entered is a: F");


		//						^^^ Changed the message

	}
}
/*
Marycruzs-Air:Week2c.1 marycruzmaciel$ javac IfElseIfChain.java
Marycruzs-Air:Week2c.1 marycruzmaciel$ java IfElseIfChain
Enter your numerical grade: 95
The grade you've entered is an: A 
Marycruzs-Air:Week2c.1 marycruzmaciel$ java IfElseIfChain
Enter your numerical grade: 88
The grade you've entered is a: B
Marycruzs-Air:Week2c.1 marycruzmaciel$ java IfElseIfChain
Enter your numerical grade: 77
The grade you've entered is a: C
Marycruzs-Air:Week2c.1 marycruzmaciel$ java IfElseIfChain
Enter your numerical grade: 66
The grade you've entered is a: D
Marycruzs-Air:Week2c.1 marycruzmaciel$ java IfElseIfChain
Enter your numerical grade: 59
The grade you've entered is a: F
*/
