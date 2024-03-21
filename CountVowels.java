import java.io.*;
class CountVowels
{
    public static void main(String[] args)
    {
        String str = new String("The code is named StringProcessing ");
        
        int numChars = str.length(), vowelCount = 0;

        System.out.println("The String: " + str);
        for (int i = 0; i < numChars; i++)
        {
            switch(str.charAt(i))
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowelCount++;
            }
        }
        System.out.println("It has " + vowelCount + " Vowels");
    }
}