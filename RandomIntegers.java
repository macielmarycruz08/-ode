
class RandomIntegers
{
	public static double min(double anArray[])
	{
		int i = 0;
		for (int i1 = 0; i1 < anArray.length; i1++)
		{
			if (anArray[i1] > anArray[i]) 
				i = i1;
		}
		return anArray[i];
	}
	public static double max(double anArray[])
	{
		int i = 0;
		for (int i1 = 0; i1 <anArray.length; i1++)
		{
			if(anArray[i1] > anArray[i])
				i = i1;
		}
		return anArray[i];
		}

	public static double average(double anArray [])
	{
		double total = 0;
		for (int i1 =0; i1 < anArray.length; i1++)
		{
			total += anArray[i1];
		}
		return total/anArray.length;
	}

	public static void main(String[] args)
	{
		double doubleArray[] = new double[3];
		doubleArray[0]=12.1;
		doubleArray[1]=11.2;
		doubleArray[2]=13.3;
        System.out.println("smallest values is " + min(doubleArray));
        System.out.println("largest value is " + max(doubleArray));
        System.out.println("Average value is " + average(doubleArray));
    }
}