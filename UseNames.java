// Marycruz Maciel 
//Sept 09 2022
//Description: Shows how UseNames.java uses Names.java
//File Name: UseNames.java
//To Compile in terminal type: javac UseNames.java
//To run the program type: java UseNames
class UseNames 
{
	public static void main(String[] args)
	{
		// call default constructor 
		Names me = new Names();
		// call the explicit constructor
		Names someone = new Names("Ellen", "H","Venable");

		System.out.println(me); //Alexandre Vesselinov Stoykov
		System.out.println(someone); //Ellen H. Venable
		someone.swap();
		System.out.println(someone); //Vanable H. Ellen
	}
}
/* Marycruzs-Air:Week 2A.1 marycruzmaciel$  javac UseNames.java
Marycruzs-Air:Week 2A.1 marycruzmaciel$ java UseNames
Alexandre Vesselinov Stoykov
Ellen H Venable
Venable H Ellen
*/