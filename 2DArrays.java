// Name: Marycruz Maciel
// Date: 12/02/2022
// File Name: 2DArrays.java
// Description: Add or change something to them, and place comments in your program // to show me what you did

import java.util.Scanner;
class arrays
{
  public static void main(String[] args)
  {

      // two dimensional array
      double val[][] = {//j is the COLUMN 
      // ^^ Changed int to double due to decimal values 
                //     j = 0, 1,2,3  ...   i is the ROW,
              /* i j */   {8.6,16,9,52},  // i = 0
              //			added a value in decimal form 
                          {3,15,27.9,6},  // i =1
              //			added a value in decimal form 
                          {7,25,2,10.2},  // i =2
              //			added a value in decimal form 

                     };
     System.out.println("val[2][2]= " + val[2][2]);  //2 switched up the values 
     System.out.println("val[0][3]= " + val[0][3]);  //52
     System.out.println("val[1][1]= " + val[1][1]);  //15 switch up the values 
  }
}
/*
Marycruzs-Air:Week5c marycruzmaciel$ javac 2DArrays.java
Marycruzs-Air:Week5c marycruzmaciel$ java arrays
val[2][2]= 2.0
val[0][3]= 52.0
val[1][1]= 15.0
*/

class ArrayExample
{
  static void show3d(int a[][]) // changed it show2d to show3d to see any differnce 
  {
    //a[x][]
    //"a.length" refers to the value of "x", number of rows
    for (int i = 0; i < a.length; i++)      // ROWS
    {
       // a[][y] 
       // "a[0].length" refers to the value of "y"
       for(int j = 0; j < a[0].length; j++) // COLUMNS
       // array_element_value+space
       System.out.print(a[i][j]+" ");

     // show a new line every new row
     System.out.println();  
    } 
  }
  static void make3d(int a[][])
  {
    int k=0;
    for (int i = 0; i < a.length; i++)
        for(int j = 0; j < a[0].length; j++)
            a[i][j]= k++;
  }
  public static void main(String[] args)
  {
    int vals[][] = new int[4][3]; // deleted a row
    make3d(vals);
    show3d(vals);
  }
}

/*
Marycruzs-Air:Week5c marycruzmaciel$ javac 2DArrays.java
Marycruzs-Air:Week5c marycruzmaciel$ java ArrayExample
0 1 2 
3 4 5 
6 7 8 
9 10 11 
*/


