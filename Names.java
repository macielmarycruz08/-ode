// Marycruz Maciel 
//Sept 08 2022
//Description:  
// - swap information between different variables
// - use two Java files for one Java program
//File Name: Names.java
//To Compile in terminal type: javac UseNames.java
//To run the program type: java UseNames

class Names 
{
	//data declaration section 
	String first, middle, last;

	//method definition section 
	Names() //Default Constructor
	{
		first = "Alexandre";
		middle = "Vesselinov";
		last = "Stoykov";
	}

	// explicit constructor 
	Names(String newF, String newM, String newL)
	{
		first = newF;
		middle = newM;
		last = newL;
	}

	//method to swap first and last names 
	void swap()
	{
		String temp; //need this to store the text temporarily 
		temp = first; // temp = Alendre 
		first = last; // first = Stoykov
		last = temp; //last = Alexandre 
	}

	public String toString()
	{
		return first + " " + middle + " " + last;
	}
}