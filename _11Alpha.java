import java.util.*;
class _11Alpha
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,j,n,l,max=0,len;
        String temp="";
        System.out.println("Enter n");
        n=Integer.parseInt(in.nextLine());
        String a[]=new String[n];
        System.out.println("Enter names");
        for(i=0;i<n;i++)
            a[i]=in.next();
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (a[i].compareTo(a[j]) > 0) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("The names in alphabetical order are:");
        for ( i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
/*
   Output:
Enter n
3
Enter names
Kalash
Priya
Ananya
The names in alphabetical order are:
Ananya
Kalash
Priya
*/