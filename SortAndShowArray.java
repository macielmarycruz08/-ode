// Name: Marycruz Maciel
// Date: 12/02/2022
// File Name: SortAndShowArray.java
// Description: Type up the sample program below, save it as SortAndShowArray.java and get it to work
class SortAndShowArray 
{
	public static void showArray(double c[]) // array c is the parameter 
	{
		// show the array 
		System.out.print("Array = {");
		int k;
		for (k = 0; k < c.length - 1; k++)
			System.out.print(c[k] + ",");
		System.out.print(c[k] + "}\n");
	}

	public static void bubbleSort(double x[])
	{
		//changing the array here will 
		//change the array declared in the main, becuase array is a 
		//pointer to array c in the main (...shallow)

		//loop that repeats the inner loop for every number sorts the entire array 
		for (int j =0; j < x.length -1; j++)
		{
			//loop to move the biggest to the right 
			for (int i = 0; i < x.length -1; i++)
			{
				if (x[i] > x[i+1])
				{
					double temp = x[i];
					x[i] = x[i+1];
					x[i+1] = temp;
				}
			}
		}
	}

	public static void main(String[] args)
	{
		double X[] = {4.4,3.3,2.2,1.1};
		//pass the entire array X into the method (by reference)
		showArray(X);
		//sorting array x in the method sorts X in the main 
		bubbleSort(X);
		//show the changed array 
		showArray(X);
	}
}
/*
Marycruzs-Air:Week5c marycruzmaciel$ javac SortAndShowArray.java
Marycruzs-Air:Week5c marycruzmaciel$ java SortAndShowArray
Array = {4.4,3.3,2.2,1.1}
Array = {1.1,2.2,3.3,4.4}
*/



