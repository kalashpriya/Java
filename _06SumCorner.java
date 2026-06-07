//Implementation
import java.util.Scanner;
class _6SumCorner
{
    public static void main()//main function
    {
        Scanner in = new Scanner(System.in);
        int i,j,n,k,sum=0;
        //accepting inputs
        System.out.print("ENTER THE VALUE OF N: ");
        n=in.nextInt();
        if((n<2)||(n>10))//if condition 
        {
            System.out.println("Invalid Input!");
            return;
        }//if condition closed
        int a[][]=new int[n][n];
        //accepting inputs in the 2D array
        System.out.println("ENTER ELEMENTS OF MATRIX:");
        for(i=0;i<n;i++)//for loop
        {
            for(j=0;j<n;j++)
                a[i][j]=in.nextInt();
        }
        //displaying original matrix
        System.out.println("ORIGINAL MATRIX");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
                System.out.print(a[i][j]+" ");//print statement
            System.out.println();
        }
        //displaying the rearranged matrix
        System.out.println("ARRANGED MATRIX AFTER 90 DEGREE CLOCKWISE ROTATION");
        for(i=0;i<n;i++)//for loop
        {
            for(j=n-1;j>=0;j--)
                System.out.print(a[j][i]+" ");//print statement
            System.out.println();//print statement for leaving a line
        }
        k=n-1;//reducing the limit by 1
        sum+=a[0][k]+a[0][0]+a[k][k]+a[k][0];//calculating the sum
        System.out.println("Sum of corner elements="+sum);//displaying the sum
    }
}
/**
 * Variable Description
 * Name of variable       Data Type          Purpose
 *      i                   int           used in for loop
 *      j                   int           used in for loop
 *      n                   int           used to store the size of the array
 *      k                   int           used to temporarily reduce the limit
 *     a[][]                int           used to store the entered values in array
 *     sum                  int           used to store the calculated sum
*/

/*
 * Output 1:
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
ORIGINAL MATRIX
1 2 3 
4 5 6 
7 8 9 
ARRANGED MATRIX AFTER 90 DEGREE CLOCKWISE ROTATION
7 4 1 
8 5 2 
9 6 3 
Sum of corner elements=20

 * Output 2:
ENTER THE VALUE OF N: 4
ENTER ELEMENTS OF MATRIX:
2
4
6
8
1
3
5
7
9
0
1
2
3
4
5
6
ORIGINAL MATRIX
2 4 6 8 
1 3 5 7 
9 0 1 2 
3 4 5 6 
ARRANGED MATRIX AFTER 90 DEGREE CLOCKWISE ROTATION
3 9 1 2 
4 0 3 4 
5 1 5 6 
6 2 7 8 
Sum of corner elements=19
*/
