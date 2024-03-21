//Name: Marycruz Maciel
//12-14-2022
//Program Name: Energy.java
//To compile in the terminal: javac Energy.java
//To run in the terminal: java Energy.java
//Description: A method that returns the Kinetic Energy of an object. 

public class Energy { 
	/*
	 * Write a method that returns energy of an object.
	 * The method takes as parameters the mass, height and velocity of the object
	 * The method returns the engery.
	 * Engery = mass * g * height + 0.5*5mass*v^2;
	 * g = 9.8
	 *
	 * Here is what your header should look like:
	 */
	public static double energy(double mass, double height, double velocity)
	{
		double g = 9.8;
		return (mass * g * height * 0.5*mass*velocity*velocity);
	}

	/*
	 * Write a method that returns the kineticEngery of an object.
	 * The method takes as parameters the mass and velocity of the object,
	 * The method returns the kinetic engery.
	 *
	 * Here is what your header should look like:
	 */
	public static double kineticEngery(double mass, double velocity)
	{
		return (mass*velocity*velocity)/2;
	}

	public static void main(String[] args)
	{
		double w = 0, l = 5, h = 10, d = 0, t = 0, m = 0, v = 30, r = 0;


		/*
		 * Mass    Height   Velocity    Energy      K. Energy
		 * 185      50      30.0        173,900      83,250    
		 * 185      55      40.0        247,715      148,000   
		 * 185      60      50.0        340,030      231,250   
		 * 185      65      60.0        450,845      333,000   
		 * 185      70      70.0        580,160      453,250   
		 * 185      75      80.0        727,975      592,000   
		 * 185      80      90.0        894,290      749,250   
		 * 185      85     100.0      1,079,105      925,000   
		 * 184      90     110.0      1,275,488      1,113,200 
		 * 183      95     120.0      1,487,973      1,317,600 
		 * 182     100     130.0      1,716,260      1,537,900 
		 * 181     105     140.0      1,960,049      1,773,800 
		 * 180     110     150.0      2,219,040      2,025,000 
		 * 179     115     160.0      2,492,933      2,291,200 
		 */
		h = 50;
		System.out.println("\nMass   Height   Velocity   Energy   K. Engery");
		for (m= 185.0; m> 178; m-- )
		{
			System.out.printf("%3.0f   %3.0f   &5.1f   %9.0f   %-,9.0f \n"
		                         ,m     ,h     ,v       ,energy(m,h,v)   ,kineticEngery(m,v) );

			/*
			System.out.printlm(m+"   "+h+"   "
			                                     +engery(m,h,v)+"   "
			                                     +kineticEnergy(m,v) );
			*/

			h+=5;
			v+=10;

			//the mass stays at 185, until velocity reaches 100
			if ( v <= 100)
				m++;
		}//end of the loop
	}//end of the main
}//end of the class

/* 
Marycruzs-Air:week4b1 marycruzmaciel$ javac Energy.java
Marycruzs-Air:week4b1 marycruzmaciel$ java Energy.java

Mass   Height   Velocity   Energy   K. Engery
185    50   &5.1f          30   7,546,612,500 
185    55   &5.1f          40   14,757,820,000 
185    60   &5.1f          50   25,155,375,000 
185    65   &5.1f          60   39,242,385,000 
185    70   &5.1f          70   57,521,957,500 
185    75   &5.1f          80   80,497,200,000 
185    80   &5.1f          90   108,671,220,000 
185    85   &5.1f         100   142,547,125,000 
184    90   &5.1f         110   180,659,001,600 
183    95   &5.1f         120   224,483,464,800 
182   100   &5.1f         130   274,299,844,000 
181   105   &5.1f         140   330,368,476,200 
180   110   &5.1f         150   392,931,000,000 
179   115   &5.1f         160   462,210,649,600 
*/