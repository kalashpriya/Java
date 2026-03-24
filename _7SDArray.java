//Implementation
import java.util.*;
class _7SDArray
{
    public static void main()//main method
    {
        Scanner in=new Scanner(System.in);
        int i,j,n=1,r=0,t=0;
        int a[]=new int[20];//array declaration
        System.out.println("Enter 20 numbers");
        for(i=0;i<20;i++)//for loop
            a[i]=in.nextInt();//accepting inputs
        for(i=0;i<19;i++)//bubble sorting
        {
            for(j=0;j<19-i;j++)
            {
                if(a[j]>a[j+1])//if condition
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        //displaying the rearranged array
        System.out.println("Sorted Array");//print statement
        for(i=0;i<20;i++)//for loop
            System.out.print(a[i]+" ");
        System.out.println();//print statement for leaving a line
        System.out.println("Series");
        r=a[0]+1;
        for(i=r;i<a[19];i++)//for loop
        {
            if(a[n]!=i)
                System.out.print(i+" ");//displaying the series
            else
                n++;
        }
    }
}
/**
 * Variable Description
 * Name of variable       Data Type          Purpose
 *      i                   int           used in for loop
 *      j                   int           used in for loop
 *      r                   int           used in for loop
 *      t                   int           used in sorting to temporarily hold values
 *      n                   int           used to store the position of the array elements
 *     a[]                  int           used to store the entered values in array
*/

/*
 * Output 1:
Enter 20 numbers
30
28
27
25
23
22
21
20
1
2
4
3
5
6
16
18
19
13
9
7
Sorted Array
1 2 3 4 5 6 7 9 13 16 18 19 20 21 22 23 25 27 28 30 
Series
8 10 11 12 14 15 17 24 26 29

 * Output 2:
Enter 20 numbers
25
21
19
17
18
16
14
13
12
0
2
4
6
8
7
9
1
5
3
22
Sorted Array
0 1 2 3 4 5 6 7 8 9 12 13 14 16 17 18 19 21 22 25 
Series
10 11 15 20 23 24 
*/