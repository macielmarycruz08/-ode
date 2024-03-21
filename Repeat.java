import java.util.*;
class Repeat
 {
	public static void main(String[] args) 
	{
		/*
		System.out.println("Helloo");
		System.out.println("Helloo");
		System.out.println("Helloo");
		System.out.println("Helloo");
		System.out.println("Helloo");
		*/
		// for loop, repetition 
		//for ( start; stop; step)
		for (int i = 0; i <= 4; i+=1) // i = 0,1,2,3,4 PART: LOOP
		{
			//System.out.println("Helloo"); //PART: LOOP
			System.out.println("i = " + i); //PART: LOOP
		}
		// rewrite teh above using a while loop 
		int j = 0; //sart 
		while (j <= 4) //stop
		{
			System.out.println("while j = " +j );
			j += 1; //step
		}

		System.out.println("*********"); //PART: LOOP
		for (int i = 0; i <= 4; i+=2) // i = 0,2,4 PART: LOOP
			System.out.println("i = " + i); //PART: LOOP

		// rewrite the above using a while loop 
		j = 0; //sart 
		while (j <= 4) //stop
		{
			System.out.println("while j = " +j );
			j += 2; //step
		}

		System.out.println("*********"); //PART: LOOP
		for (int i = 4; i >= 0; i-=2) // i = 4,2,0 //PART: LOOP
			System.out.println("i = " + i); //PART: LOOP

		// rewrite teh above using a while loop 
		j = 4; //sart 
		while (j >= 0) //stop
		{
			System.out.println("while j = " +j );
			j -= 2; //step
		}
	}
}
// (PART: LOOP) In video: "These are your basics about for loop"