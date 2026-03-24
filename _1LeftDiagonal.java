//Implementation
import java.util.Scanner;
public class _1LeftDiagonal
{
    public static void main()//main function
    {
        Scanner in =new Scanner(System.in);
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
        //printing the left diagonal
        System.out.println("LEFT PRINCIPAL DIAGONAL OF MATRIX");
        for (i=0;i<n;i++) 
        {
            for (j=0;j<=i;j++) 
            {
                if(j==i)
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
ENTER THE VALUE OF N: 3
ENTER ELEMENTS OF MATRIX:
6
8
0
3
5
7
2
1
4
ORIGINAL MATRIX
6 8 0 
3 5 7 
2 1 4 
LEFT PRINCIPAL DIAGONAL OF MATRIX
6 
  5 
    4 
    
    
 * Output 2:
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
1
2
3
4
5
6
7
ORIGINAL MATRIX
1 2 3 4 
5 6 7 8 
9 1 2 3 
4 5 6 7 
LEFT PRINCIPAL DIAGONAL OF MATRIX
1 
  6 
    2 
      7
 */