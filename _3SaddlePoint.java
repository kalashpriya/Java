//Implementation
import java.util.Scanner;
class _3SaddlePoint
{
    public static void main()//main function
    {
        Scanner in = new Scanner(System.in);
        int i,j,n,k,max,min,pos=0,K=0;
        //accepting inputs
        System.out.print("ENTER THE VALUE OF N: ");
        n=in.nextInt();
        int a[][]=new int[n][n];
        //accepting inputs in the 2D array
        System.out.println("ENTER ELEMENTS OF MATRIX:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
                a[i][j]=in.nextInt();
        }
        //displaying original matrix
        System.out.println("ORIGINAL MATRIX");
        for(i=0;i<n;i++) 
        {
            for(j=0;j<n;j++) 
                System.out.print(a[i][j] + " ");//print statement
            System.out.println();//print statement for changing the line
        }
        //finding the saddle point
        for(i=0;i<n;i++) 
        {
            min=a[i][0];//assigning the minimum value
            for(j=1;j<n;j++) 
            {
                if(min>a[i][j]) 
                {
                    min=a[i][j];
                    pos=j;
                }//if condition closed
            }//loop closed
            for(k=0;k<n;k++) 
            {
                if(min<a[k][pos]) 
                   break;
            }//loop closed
            if(k==n) 
            {
                System.out.println("Saddle Point Found= "+min);//print statement
                K++;
            }//if condition closed
        }//loop closed
        if(K==0)
            System.out.println("Saddle Point Not Found!!");
    }
}
/**
 * Variable Description
 * Name of variable     Data Type       Purpose
 *      i                 int           used in for loop
 *      j                 int           used in for loop
 *      k                 int           used in for loop
 *      b[]               int           used to store the non-boundary elements
 *      a[][]             int           used to store the entered values in array
 *      m                 int           used to store the entered value of M
 *      K                 int           used as a counter variable
 *      n                 int           used to store the entered value of N
 *      min               int           used to store the minimum value in array
 *      max               int           used to store the maximum value in array
 */
/*
 * Output 1:
ENTER THE VALUE OF N: 3
ENTER ELEMENTS OF MATRIX:
0
1
2
2
3
5
-1
-2
7
ORIGINAL MATRIX
0 1 2 
2 3 5 
-1 -2 7 
Saddle Point Found= 2

 * Output 2:
ENTER THE VALUE OF N: 3
ENTER ELEMENTS OF MATRIX:
6
7
3
0
8
9
7
0
1
ORIGINAL MATRIX
6 7 3 
0 8 9 
7 0 1 
Saddle Point Not Found!!
 */