//Name: Marycruz Maciel
//12-14-2022
//Program Name: AreaVolume.java
//To compile in the terminal: javac AreaVolume.java
//To run in the terminal: java AreaVolume.java
//Description: A method that returns the floor area of a room.  

public class AreaVolume {

/* 
 * Write a method that returns area of a room.
 * the method take as parameters the width and length of the room,
 * and returns the area.
 *
 * the area = width * length
 * 
 * Here is what your header should look like:
 */
	public static double area(double width, double length)
	{
		return width * length;

	}

	/*
	 * The method that retiurns volume of a room.
	 * The method takes as parameters the width , length  and height of a room,
	 * and return the volume.
	 * The volume = width * length * height
	 * 
	 * Here is what your header should look like:
	 */
	public static double volume(double width, double length, double height)
	{
		return width * length * height;
	}

	public static void main (String[] args)
	{
		double w = 0, l = 5, h = 10;

		/*
		 *
		 * Here is the table that I should print out for area and volume.
		 * The height of the object will start at 10 meters and go up by 10 meters every row.
		 * The length starts at 30 meters, and increase by 5 on every row.
		 * The width starts at 10 meters then will start dropping by one  for each row,
		 * unitil it reaches 6.

		 width   length   height   area   volume
		 10.0    5.0      10.0     50.0   500.0
		 9.0     10.0     20.0     90.0   1800.0
		 8.0     15.0     30.0     120.0  3600.0
		 7.0     20.0     40.0     140.0  5600.0
		 6.0     25.0     50.0     150.0  7500.0
		 */
		System.out.println("width   length   height   area   volume");
		for (w = 10.0; w > 5; w-- )
		{
			System.out.printf("%4.1f   %4.1f   %4.1f   %5.1f        %.1f \n"
		                         ,w      ,l      ,h    ,area(w, l)  ,volume(w, l, h) );

			l+=5;
			h+=10;
		}
	}// end of main

	/* Marycruzs-Air:week4b1 marycruzmaciel$ javac AreaVolume.java
       Marycruzs-Air:week4b1 marycruzmaciel$ java AreaVolume.java
       width   length   height   area   volume
       10.0    5.0   10.0    50.0        500.0 
        9.0   10.0   20.0    90.0        1800.0 
        8.0   15.0   30.0   120.0        3600.0 
        7.0   20.0   40.0   140.0        5600.0 
        6.0   25.0   50.0   150.0        7500.0 





}