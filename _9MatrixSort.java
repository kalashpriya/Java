//Implementation
import java.util.Scanner;
public class _9MatrixSort
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int i,j,t,min;
        //accepting inputs
        System.out.print("ENTER MATRIX SIZE (M): ");
        int m=in.nextInt();
        System.out.print("ENTER MATRIX SIZE (N): ");
        int n=in.nextInt();
        int a[][]=new int[m][n];
        //accepting inputs in the 2D array
        System.out.println("ENTER ELEMENTS OF MATRIX");
        for (i=0;i<m;i++)
        {
            for (j=0;j<n;j++) 
                a[i][j]=in.nextInt();
        }
        //displaying original matrix
        System.out.println("ORIGINAL MATRIX");
        for (i=0;i<m;i++) {
            for (j=0;j<n;j++) 
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        //storing the non-boundary elements in a single dimensional array
        int b[]=new int[(m-2)*(n-2)];
        int k=0;
        for (i=1;i<m-1;i++) 
        {
            for (j=1;j<n-1;j++) 
            {
                b[k++]=a[i][j];
            }
        }
        //sorting using selection sort
        for (i=0;i<k-1;i++) 
        {
            min=i;
            for (j=i+1;j<k;j++) 
            {
                if (b[j]>b[min])
                    min=j;
            }
            t = b[i];
            b[i] = b[min];
            b[min] = t;
        } 
        //assigning the sorted elements in 2D array
        k=0;
        for (i =1; i<m-1;i++) 
        {
            for (j=1;j<n-1;j++) 
            {
                a[i][j]=b[k++];
            }
        }
        //printing the rearranged matrix
        System.out.println("REARRANGED MATRIX");
        for (i=0;i<m;i++) 
        {
            for (j=0;j<n;j++) 
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
/**
 * Variable Description
 * Name of variable        Data Type          Purpose
 *      i                    int           used in for loop
 *      j                    int           used in for loop
 *      b[]                  int           used to store the non-boundary elements
 *      a[][]                int           used to store the entered values in array
 *      m                    int           used to store the entered value of M
 *      n                    int           used to store the entered value of N
 *      min                  int           used to store the minimum value in array
 */
/*
 * Output 1:
ENTER MATRIX SIZE (M): 4
ENTER MATRIX SIZE (N): 3
ENTER ELEMENTS OF MATRIX
1
8
6
0
4
6
2
7
8
3
5
6
ORIGINAL MATRIX
1 8 6 
0 4 6 
2 7 8 
3 5 6 
REARRANGED MATRIX
1 8 6 
0 7 6 
2 4 8 
3 5 6 

 * Output 2:
ENTER MATRIX SIZE (M): 3
ENTER MATRIX SIZE (N): 4
ENTER ELEMENTS OF MATRIX
7
2
5
0
9
1
5
7
9
3
6
8
ORIGINAL MATRIX
7 2 5 0 
9 1 5 7 
9 3 6 8 
REARRANGED MATRIX
7 2 5 0 
9 5 1 7 
9 3 6 8 
 */