// Marycruz Maciel
// 11-28-2022
// Description: if, else if, else example
// File Name: Selection.java
// To Compile: javac Selection.java
// To Run: java Selection
import java.io.*;
import java.text.*;
class Selection
{
	public static void main(String[] args)
	throws IOException 
	{
		double temperature;
		String n1; //changed s1 to n1 
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter the current temperature: ");
	//						^^^ Changed the message

		n1 = br.readLine();
		// changed the variable s1 to n1 
		temperature = Double.parseDouble(n1);

		if (temperature < 0)
		{
			System.out.println("The current temperature you've entered ");
			//						^^^ Changed the message
			System.out.print(" is negative, too cold to be out. ");
			//						^^^ Changed the message

		}
		else if (temperature == 0)
			System.out.println("The current temperature is zero. ");
		else
			System.out.println("The current temperwature is positive. Enjoy your day :) ");
		//						^^^ Changed the message

	}
}
/*
Marycruzs-Air:Week2c.1 marycruzmaciel$ javac Selection.java
Marycruzs-Air:Week2c.1 marycruzmaciel$ java Selection
Enter the current temperature: -40
The current temperature you've entered 
 is negative, too cold to be out. Marycruzs-Air:Week2c.1 marycruzmaciel$ java Selection
Enter the current temperature: 0
The current temperature is zero. 
Marycruzs-Air:Week2c.1 marycruzmaciel$ java Selection
Enter the current temperature: 70
The current temperwature is positive. Enjoy your day :)
*/
