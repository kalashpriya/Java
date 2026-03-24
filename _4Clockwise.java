//Implementation
import java.util.Scanner;
class _4Clockwise
{
    public static void main()//main function
    {
        Scanner in=new Scanner(System.in);
        int i,j,d,k,c=1,n;
        //accepting inputs
        System.out.print("ENTER THE VALUE OF N: ");
        n=in.nextInt();
        int a[][]=new int[n][n];
        //accepting inputs in the 2D array
        System.out.println("ENTER ELEMENTS OF MATRIX:");
        d=0;
        k=n-1;
        while(c<n*n)//while loop
        {
            for(i=d;i<k;i++)//for loop
            {
                a[d][i]=in.nextInt();
                c++;
            }
            for(j=d;j<k;j++)//for loop
            {
                a[j][k]=in.nextInt();
                c++;
            }
            for(i=k;i>d;i--)//for loop
            {
                a[k][i]=in.nextInt();
                c++;
            }
            for(j=k;j>d;j--)//for loop
            {
                a[j][d]=in.nextInt();
                c++;
            }
            k--;
            d++;
        }//while loop closed
        if(n%2!=0)//if condition
            a[n/2][n/2]=in.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
                System.out.print(a[i][j]+" ");//print statement
            System.out.println();
        }
    }
}
/**
 * Variable Description
 * Name of variable         Data Type          Purpose
 *      i                     int           used in for loop
 *      j                     int           used in for loop
 *      d                     int           used in for loop
 *      k                     int           used in for loop
 *      c                     int           used as a counter variable
 *      a[][]                 int           used to store the entered values in array
 *      n                     int           used to store the size of the array
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
9
8
7
6
5
4
1 2 3 4 
8 7 6 5 
9 4 5 6 
0 9 8 7 

 * Output 2:
ENTER THE VALUE OF N: 3
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
1 2 3 
8 9 4 
7 6 5 
 */
