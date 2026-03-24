//Implementation
import java.util.Scanner;
public class _2RightDiagonal
{
    public static void main()//main function
    {
        Scanner in = new Scanner(System.in);
        int n,i,j;
        //accepting inputs
        System.out.print("ENTER THE VALUE OF N: ");
        n=in.nextInt();
        int a[][]=new int[n][n];
        //accepting inputs in the 2D array
        System.out.println("ENTER ELEMENTS OF MATRIX:");
        for (i=0;i<n;i++)
        {
            for (j=0;j<n;j++)
                a[i][j] = in.nextInt();
        }
        //displaying original matrix
        System.out.println("ORIGINAL MATRIX");
        for (i=0;i<n;i++) 
        {
            for (j=0;j<n;j++) 
                System.out.print(a[i][j] + " ");//print statement
            System.out.println();//print statement for changing the line
        }
        //printing the right diagonal
        System.out.println("RIGHT PRINCIPAL DIAGONAL OF MATRIX");
        for (i=0;i<n;i++) 
        {
            for (j=0;j<=n-i;j++) 
            {
                 if(j==n-i-1)
                System.out.print(a[i][j] + " ");//print statement
                else 
                System.out.print("  ");//print statement for blank spaces
            }
            System.out.println();
        }//loop closed
    }//main closed
}
/**
 * Variable Description
 * Name of variable         Data Type          Purpose
 *      i                     int           used in for loop
 *      j                     int           used in for loop
 *      a[][]                 int           used to store the entered values in array
 *      n                     int           used to store the entered value 
 */

/*
 * Output 1:
ENTER THE VALUE OF N: 4
ENTER ELEMENTS OF MATRIX:
1
2
3
4
5
6
7
8
9
0
1
2
3
4
5
6
ORIGINAL MATRIX
1 2 3 4 
5 6 7 8 
9 0 1 2 
3 4 5 6 
RIGHT PRINCIPAL DIAGONAL OF MATRIX
      4   
    7   
  0   
3 

 * Output 2:
ENTER THE VALUE OF N: 3
ENTER ELEMENTS OF MATRIX:
6
3
4
7
8
1
3
2
4
ORIGINAL MATRIX
6 3 4 
7 8 1 
3 2 4 
RIGHT PRINCIPAL DIAGONAL OF MATRIX
    4   
  8   
3 

*/
