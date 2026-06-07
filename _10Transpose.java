import java.util.*;
class _10Transpose
{
    int a[][];
    int m;
    _10Transpose(int mm)
    {
        m=mm;
        a=new int[m][m];
    }
    void fill()
    {
        Scanner in=new Scanner (System.in);
        System.out.println("Enter elements in 2d array");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
                a[i][j]=in.nextInt();
        }
        System.out.println("Original");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
                System.out.print(a[i][j]+" ");
            System.out.println();
        }
    }
    _10Transpose change()
    {
        int temp[][]=new int[m][m];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
                temp[i][j]=a[i][j];
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
                this.a[i][j]=temp[j][i];
        }
        return this;
    }
    void show()
    {
        System.out.println("Transpose");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
                System.out.print(a[i][j]+" ");
            System.out.println();
        }
    }
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter size");
        int M=in.nextInt();
        _10Transpose ob=new _10Transpose(M);
        ob.fill();
        ob.change();
        ob.show();
    }
}
/**
 * Variable Description
 * Name of variable         Data Type          Purpose
 *      i                     int           used in for loop
 *      j                     int           used in for loop
 *      a[][]                 int           used to store entered values in array
 *      n                     int           used to store entered value 
 */

/*
 * Output 1:
Enter size
3
Enter elements in 2d array
1
2
3
4
5
6
7
8
9
Original
1 2 3 
4 5 6 
7 8 9 
Transpose
1 4 7 
2 5 8 
3 6 9 
*/
