// Name: Marycruz Maciel
// Date: 12/14/2022
// File Name: StringBufferMethods.java
// Description: Add or change something to them, 
//              and place comments in your program to show me what you did.
import java.io.*;
import java.util.StringTokenizer;
class StringBufferMethods
{
    public static void main(String[] args)
    {
        StringBuffer str = new StringBuffer(" The number of characters include spaces");
        //                                     ^^^^ Changed the message 
        int i, numChars;

        System.out.println("The original string is: " +str);
        numChars = str.length();
        System.out.println("This string has " + numChars + " characters");
		
	// insert "I know" after the 4th character
        str.insert(1, " I know ");
        //         ^ changed the character
        System.out.println("The string after insertion is now: " + str);
        numChars = str.length();
        System.out.println("This string has " + numChars + " characters");

	// replace characters 12 to 18 with "to"
        str.replace(1,34," do ");
        // Changed the replaceable characters
        System.out.println("The string after replacement is: " + str);
        numChars = str.length();
        System.out.println("This string has " + numChars + " characters");

	// reverse the characters
        str.reverse();
        System.out.println("The string after being reversed is:" + str);

	// split a string into words
        StringTokenizer stb = new StringTokenizer("One two three four");
        System.out.println("First word is: " + stb.nextToken());
        System.out.println("Second word is: " + stb.nextToken());
        System.out.println("Third word is: " + stb.nextToken());
        System.out.println("Fourth word is: " + stb.nextToken());
    }
}
/*
Marycruzs-Air:Week5A.1 marycruzmaciel$ javac StringBufferMethods.java
Marycruzs-Air:Week5A.1 marycruzmaciel$ java StringBufferMethods
The original string is:  The number of characters include spaces
This string has 40 characters
The string after insertion is now:   I know The number of characters include spaces
This string has 48 characters
The string after replacement is:   do include spaces
This string has 19 characters
The string after being reversed is:secaps edulcni od  
First word is: One
Second word is: two
Third word is: three
Fourth word is: four
*/