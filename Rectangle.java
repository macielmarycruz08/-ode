// Marycruz Maciel 
//Sept 08 2022
//Description: Returning values from methods
//File Name: Rectangle.java
//To Compile in terminal type: Rectangle.java
//To run the program type: java Rectangle
class Rectangle 
{
	// instance variables
	int length, width;

	// constructor:
	Rectangle(int newL, int newW)
	{
		length = newL;
		width = newW;
	}

	//mutator methods below 
	void changeL(int newL) { length = newL; }
	void changeW(int newW) {width = newW;}

	// accessor methods belwo that return values 
	int getL() {return length; }
	int getW() {return width; }

	//method that returns the sum of all sides
	int sum(int side1, int side2)
	{
		return side1 + side2;
	}

	// main method to start the program 
	public static void main(String[] args)
	{
		//make an instace named rect
		Rectangle rect = new Rectangle(1,2);

		//use the instance to call method that returns value
		int sum = rect.sum(10,20); //stored the vlaue in sum 

		// show the value that was returned 
		System.out.println("sum of 2 sides = " + sum);
	}
}
/* 
Marycruzs-Air:Week 2A.1 marycruzmaciel$ javac Rectangle.java
Marycruzs-Air:Week 2A.1 marycruzmaciel$ java Rectangle
sum of 2 sides = 30
*/