//Name: Marycruz Maciel
//12-14-2022
//Program Name: Test2speed.java
//To compile in the terminal: javac Test2speed.java
//To run in the terminal: java Test2speed.java
//Description: A method that returns the speed of a satellite.

public class Test2speed {
	/*
	 * Write a method that returns the speed of a satellite. 
	 * The method takes as parameters: the satellite mass and radius of orbit. 
	 * The method returns the speed of satellite in meters per second (MPS).
	 * Speed = Math.sqrt(G*mass/radius)
	 * 
	 * Where: 
     * R = Radius of Orbit
     * M = Mass of Satellite
     * G = Gravitational Constant  = 0.0000000000667 
	 * 
	 * Below is what the method header should look like:
	 */ 

public static double speed(double mass, double radius)
{
	return (mass*radius*radius)/2;
}

public static void main(String[] args)
{
	
}

}