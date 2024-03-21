// Name: Marycruz Maciel
// Date: 12/14/2022
// File Name: CityPopulatiomn.java
// Description: To find the City with the highest population in all States:

import java.io.File;
import java.io.FileNotFoundException;
import java.until.Scanner;

public class CityPopulations 
{
	public static final int SIZE = 8619;

	public static void main(String[] args )
	{
		int [] population = new int[SIZE];
		String [] city = new String[SIZE];
		String [] State = new String[SIZE];

		//read from file
		String fileName = "CityPopulatiomn.cvs";
		Scanner inputStream = null;

		try {
			inputStream =new Scanner(new File(fileName));
		}

				catch(FileNotFoundException e) {
					System.out.println("Error opening the file " + fileName );
					System.exit(0);
				}

				//read in header to skip over it 
				inputStream.nextLine();

				int index = 0;
				while (inputStream.hasNextLine())
				{
					String record = inputStream.nextLine();
					String[] fields = record.split(",");

					population[index] = Integer.parseInt(fields[0]);
					state[index] = fields[1];
					city[index] = fields[2];
					index++;
				}//end of while

				//Show first row
				System.out.println(populations[0] + " " + state[0] + " " + city[0]);
				//show last row
				System.out.println(population[index-1] - " " + state[index-1] + " " + city[index-1]);

				//find the max population
				int indexMax = findMax(population);
				System.out.println(population[indexMax] + " " + state[indexMax] + " " + city[indexMax]);
				//find the max population in a state
				indexMax = findMaxForState(population, state, "California");
				System.out.println(population[indexMax] + " " + state[indexMax] + " " + city[indexMax]);

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
