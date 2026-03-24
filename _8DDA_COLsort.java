//Implementation
import java.util.Scanner;
public class _8DDA_COLsort
{
    public static void main()//main function
    {
        Scanner in = new Scanner(System.in);
        int i,j,k,t;
        //accepting inputs
        System.out.print("ENTER THE VALUE OF N: ");
        int n = in.nextInt();
        int a[][] = new int[n][n];
        //accepting inputs in the 2D array
        System.out.println("ENTER ELEMENTS OF MATRIX:");
        for (i=0;i<n;i++) 
        {
            for (j=0;j<n;j++) 
                a[i][j]=in.nextInt();
        }
        //displaying original matrix
        System.out.println("ORIGINAL MATRIX");
        for (i=0;i<n;i++) {
            for (j=0;j<n;j++) 
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        //sorting the column elements
        for (i=0;i<n;i++) //for loop
        {
            for (j=0;j<n-i;j++) 
            {
                for (k=0;k<n-i-1;k++)
                {
                    if (a[k+1][j] < a[k][j]) 
                    {
                        t = a[k][j];
                        a[k][j] = a[k+1][j];
                        a[k+1][j] = t;
                    }
                } 
            }
        }
        //printing the rearranged matrix
        System.out.println("MATRIX AFTER SORTING COLUMNS");
        for (i=0;i<n;i++) //for loop
        {
            for (j=0;j<n;j++) 
            {
                System.out.print(a[i][j]+" ");//print command
            }
            System.out.println();
        }
    }
}
/**
 * Variable Description
 * Name of variable         Data Type          Purpose
 *      i                     int           used in for loop
 *      j                     int           used in for loop
 *      k                     int           used in loop to sort the column elements
 *      t                     int           used to temporarily store array element
 *      a[][]                 int           used to store entered values in array
 *      n                     int           used to store entered value 
 */

/*
 * Output 1:
ENTER THE VALUE OF N: 4
ENTER ELEMENTS OF MATRIX:
5
7
1
2
3
9
0
8
4
6
7
2
1
7
8
4
ORIGINAL MATRIX
5 7 1 2 
3 9 0 8 
4 6 7 2 
1 7 8 4 
MATRIX AFTER SORTING COLUMNS
1 6 0 2 
3 7 1 2 
4 7 7 4 
5 9 8 8 

 * Output 2:
ENTER THE VALUE OF N: 3
ENTER ELEMENTS OF MATRIX:
2
8
5
0
4
6
2
5
7
ORIGINAL MATRIX
2 8 5 
0 4 6 
2 5 7 
MATRIX AFTER SORTING COLUMNS
0 4 5 
2 5 6 
2 8 7 
*/