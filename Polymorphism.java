
class Polymorphism
{
  public static void kgToLb()
  {
    // assume 1 dollar = 0.85 euro
    System.out.println("kg       Lb");
    for (int kg = 1; kg <20; kg+=2)
      System.out.printf("%-2d            %.2f \n",kg, kg*2.20);
  }
  
  public static void kgToLb(int kgBegin, int kgEnd)
  {
    // assume 1 dollar = 0.85 euro
    System.out.println("kg       Lb");
    for (int kg = kgBegin; kg < kgEnd; kg+=2 )
      System.out.printf("%-2d            %.2f \n",kg, kg*2.20);
  }
  
  public static void main(String args[])
  {
    kgToLb();
    kgToLb(1, 20);
  } 
  
} // end class Polymorphism
/*
Marycruzs-Air:Week4a.1 marycruzmaciel$ javac Polymorphism.java
Marycruzs-Air:Week4a.1 marycruzmaciel$ java Polymorphism
kg       Lb
1             2.20 
3             6.60 
5             11.00 
7             15.40 
9             19.80 
11            24.20 
13            28.60 
15            33.00 
17            37.40 
19            41.80 
kg       Lb
1             2.20 
3             6.60 
5             11.00 
7             15.40 
9             19.80 
11            24.20 
13            28.60 
15            33.00 
17            37.40 
19            41.80 
*/