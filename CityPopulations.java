// Name: Marycruz Maciel
// Date: 12/14/2022
// File Name: CityPopulations.java
// Description: To find the City with the highest population in all States:

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CityPopulations 
{
	public static final int SIZE = 8619;

	public static void main(String[] args )
	{
		int [] Populations = new int[SIZE];
		String [] city = new String[SIZE];
		String [] State = new String[SIZE];

		//read from file
		String fileName = "cityPopulations.csv";
		Scanner inputStream = null;

		try {
			inputStream =new Scanner(new File(fileName));
		}

		catch(FileNotFoundException e) {
			System.out.println("Error opening the file " + fileName);
			System.exit(0);
		}

				//read in header to skip over it 
		inputStream.nextLine();

		int index = 0;
		while (inputStream.hasNextLine())
		{

			String record = inputStream.nextLine();
			String[] fields = record.split(",");

			Populations[index] = Integer.parseInt(fields[0]);
			State[index] = fields[1];
			city[index] = fields[2];
			index++;
		}//end of while

				//Show first row
		System.out.println(Populations[0] + " " + State[0] + " " + city[0]);
				//show last row
		System.out.println(Populations[index-1] + " " + State[index-1] + " " + city[index-1]);

				//find the max populations
		int indexMax = findMax(Populations);
		System.out.println(Populations[indexMax] + " " + State[indexMax] + " " + city[indexMax]);
				//find the max population in a state
		indexMax = findMaxForState(Populations, State, "California");
		System.out.println(Populations[indexMax] + " " + State[indexMax] + " " + city[indexMax]);

	}//end main

	//return the index of the max value in the array for all states
	public static int findMax(int[] array)
	{
		int max = array[0];
		int indexMax = 0;
		for(int i = 0; i < array.length; i ++)
		{
			if(array[i] > max)
			{
				max = array[i];
				indexMax = i;
			}
		}
		return indexMax;

	} 

	//return the index of the max value in the array for a specific state
	public static int findMaxForState(int[] array, String[] states, String nameOfState)
	{
		int max = array[0];
		int indexMax = 0;

		for(int i = 0; i < array.length; i++)
		{
			if(array[i] > max && states[i].equalsIgnoreCase(nameOfState))
			{
				max = array[i];
				indexMax = i;
			}
		}
		return indexMax;
	}		
		
}

/*
Marycruzs-MacBook-Air:Java Final marycruzmaciel$ javac CityPopulations.java
Marycruzs-MacBook-Air:Java Final marycruzmaciel$ java CityPopulations
2177 Alabama Ashford
5441 Wyoming Worland
418394 Florida Miami
345320 California Anaheim
