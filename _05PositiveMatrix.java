//Implementation
import java.util.Scanner;
class _5PositiveMatrix
{
    public static void main()//main function
    {
        Scanner in=new Scanner(System.in);
        int i,j,n,k,l,t;
        //accepting inputs
        System.out.print("ENTER THE VALUE OF N: ");
        n=in.nextInt();
        int a[][]=new int[n][n];
        //accepting inputs in the 2D array
        System.out.println("ENTER ELEMENTS OF MATRIX:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=in.nextInt();
                if(a[i][j]<0)
                {
                   System.out.println("ENTER POSITIVE ELEMENTS ONLY");
                   return; 
                }
            }
        }
        //displaying original matrix
        System.out.println("ORIGINAL MATRIX");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
                System.out.print(a[i][j]+" ");
            System.out.println();
        }
        //sorting the elements in ascending order
        for(i=0;i<n;i++)//for loop
        {
            for(j=0;j<n;j++)
            {
                for(k=0;k<n;k++)
                {
                    for(l=0;l<n;l++)
                    {
                        if(a[i][j]<a[k][l])//if condition
                        {
                            t=a[i][j];
                            a[i][j]=a[k][l];
                            a[k][l]=t;
                        }
                    }
                }
            }
        }
        //print statement
        System.out.println("ARRANGED MATRIX");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
                System.out.print(a[i][j]+" ");
            System.out.println();
        }
    }
}
/**
 * Variable Description
 * Name of variable       Data Type          Purpose
 *      i                   int           used in for loop
 *      j                   int           used in for loop
 *      k                   int           used in for loop
 *      l                   int           used in for loop
 *      t                   int           used to temporarily store an array element
 *      a[][                int           used to store the entered values in array
 *      n                   int           used to store the size of the array
 */

/*
 * Output 1:
ENTER THE VALUE OF N: 3
ENTER ELEMENTS OF MATRIX:
7
3
0
8
5
6
1
2
3
ORIGINAL MATRIX
7 3 0 
8 5 6 
1 2 3 
ARRANGED MATRIX
0 1 2 
3 3 5 
6 7 8

 * Output 2:
ENTER THE VALUE OF N: 4
ENTER ELEMENTS OF MATRIX:
9
1
6
-5
ENTER POSITIVE ELEMENTS ONLY
*/
