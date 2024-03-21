// Name: Marycruz Maciel
// Date: 07/27/2022
// File Name: ArrayExample.java
// Description: Write a program ArrayInputShow.java to input the following values
//	into array named prices: 10.95, 16.32, 12.15, 8.22, 15.98, 26.22, 13.54, 6.45, 17.59
class arraysInput
{
	public static void main(String[] args)
	{
		//Double a[];
		//a = new Double[1000];

		//System.out.println("a[0] = " + a[0]);
		//System.out.println("a[0] = " + a[1]);

		double prices[] = {10.95, 16.32, 12.15, 8.22, 15.98, 26.22, 13.54, 6.45, 17.59};
		/*double prices[] = {10.95, 16.32, 12.15, 8.22, 15.98, 26.22, 13.54, 6.45, 17.59}; */
		System.out.println("prices[0] = " + prices[0]);
		System.out.println("prices[1] = " + prices[1]);
		System.out.println("prices[2] = " + prices[2]);
		System.out.println("prices[3] = " + prices[3]);
		System.out.println("prices[4] = " + prices[4]);
		System.out.println("prices[5] = " + prices[5]);
		System.out.println("prices[6] = " + prices[6]);
		System.out.println("prices[7] = " + prices[7]);
		System.out.println("prices[8] = " + prices[8]);

		System.out.println("Reverse Order array: ");

		for (int i = prices.length - 1; i >= 0; i--)
		{
			System.out.print(prices[i] + " ");
		}
	}

}

/*
Marycruzs-Air:Week5b marycruzmaciel$ javac ArrayInputShow.java
Marycruzs-Air:Week5b marycruzmaciel$ java arraysInput
prices[0] = 10.95
prices[1] = 16.32
prices[2] = 12.15
prices[3] = 8.22
prices[4] = 15.98
prices[5] = 26.22
prices[6] = 13.54
prices[7] = 6.45
prices[8] = 17.59
Reverse Order array: 
17.59 6.45 13.54 26.22 15.98 8.22 12.15 16.32 10.95
*/