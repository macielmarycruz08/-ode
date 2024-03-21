// Name: Marycruz Maciel
// Date: 12/14/2022
// File Name: StringProcessing.java
// Description: Add or change something to them, 
//              and place comments in your program to show me what you did.
import java.io.*;
class CountVowels
{
    public static void main(String[] args)
    {
        String str = new String("How many vowels are there in this sentence?");
        //                          ^^^^Changed the message (prompt)
        
        int numChars = str.length(), vowelCount = 0, consonantsCount = 0; /*a =0, e=0, i=0, o=0, u=0; */
//                                                      ^^added counting consonants 
        System.out.println("The String: " + str);
        for (int i = 0; i < numChars; i++)
        {
           /* if (c == 'a')
                a++;
            else if (c == 'e')
                e++;
            else if (c == 'i')
                i++;
            else if (c == 'o')
                o++;
            else if (c == 'u')
                u++;
            else
                vowelCount++; */
            switch(str.charAt(i))
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u': 
                    vowelCount++;
            }
            switch(str.charAt(i))
            {
                case 'h':
                case 'w':
                case 'm':
                case 'n':
                case 'y':
                case 'v':
                case 'l':
                case 'r':
                case 't':
                case 's':
                case 'c':
                    consonantsCount++;
//                  ^^^ adding the consonants that appear in the message 
            }
        }
        System.out.println("This sentemce has " + vowelCount + " of vowels");
        System.out.println("This sentemce has " + consonantsCount + " of consanants");
        //                  ^^^^Asked to print the number of vowels and consonants.

    }
}
/*
Marycruzs-Air:Week5A.1 marycruzmaciel$ javac StringProcessing.java
Marycruzs-Air:Week5A.1 marycruzmaciel$ java CountVowels
The String: How many vowels are there in this sentence?
This sentemce has 13 of vowels
This sentemce has 21 of consanants
*/

class StringMethods
{
    public static int countLetter(String sentence, char letter)
    {
        int count = 0;
        for (int i = 0; i < sentence.length(); i++)
            if (sentence.charAt(i) == letter)
                count++;
            return count;
    }
    public static void main(String[] args)
    {
        String sent = "Hello World";
        System.out.println("'l' appears " + countLetter(sent, 'l') + " times" + 
                            "'o' appears " + countLetter(sent, 'o') + " times");
//                          ^^^ Asked to print how many times "l" and "o" appears in the prompt
    }
}
/*
Marycruzs-Air:Week5A.1 marycruzmaciel$ javac StringProcessing.java
Marycruzs-Air:Week5A.1 marycruzmaciel$ java StringMethods
'l' appears 3 times'o' appears 2 times
*/

class StringInput
{
    public static void main(String[] args)
    throws IOException
    {
        String s1,s2,s3;
        // adding s3
        double num1, num2, num3, product;
        // Added a third number to multiply.

    // set up the basic input stream
    // needed for info to be entered via the keyboard
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
    // tell the user what to enter
        System.out.print("Enter a number:");
    //                ^^^^^^^^^^^^^^^ prompt
    // prompt - message that tells the user what to enter

    // when the program reaches this...
        s1 = br.readLine(); // ...it will pause, this is INPUT
    //    ^^^ user enters a number, and presses Enter...

        num1 = Double.parseDouble(s1); 
    // ... ^^ the program resumes and converts s1 into a double

        System.out.print("Enter another number:");
        s2 = br.readLine();
        num2 = Double.parseDouble(s2);

        System.out.print("Enter last number:");
        s3 = br.readLine();
        num3 = Double.parseDouble(s3);
        // Adding a num3 

        product = num1 * num2 * num3;
        // multiply three numbers 

        System.out.println(num1 + " times " + num2 + " times " + num3 + " = " + product);
        // ^^ asked to print the product of all three numbers 
    }
}
/*
Marycruzs-Air:Week5A.1 marycruzmaciel$ javac StringProcessing.java
Marycruzs-Air:Week5A.1 marycruzmaciel$ java StringInput
Enter a number:2
Enter another number:3
Enter last number:5
2.0 times 3.0 times 5.0 = 30.0
*/