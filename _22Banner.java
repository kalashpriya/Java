import java.util.*;
class _22Banner
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,j,n,l,max=0,len;
        System.out.println("Enter n");
        n=Integer.parseInt(in.nextLine());
        if (n < 2 || n > 9) 
        {
            System.out.println("INVALID INPUT");
            return;
        }
        String a[]=new String[n];
        System.out.println("Enter names:");
        for(i=0;i<n;i++)
            a[i]=in.nextLine();

        for(i=0;i<n;i++)
        {
            l=a[i].length();
            max=Math.max(max,l);
        }
        
        for(i=0;i<max;i++) 
        {
            for(j=0;j<n;j++) 
            {
                len=a[j].length();
                if(i<len) 
                    System.out.print(a[j].charAt(i) + "\t");
                else 
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
}
/*
 Output:
Enter n
4
Enter names:
Barcelona
Remus
Romulus
La Ciao
B	R	R	L	
a	e	o	a	
r	m	m	 	
c	u	u	C	
e	s	l	i	
l		u	a	
o		s	o	
n				
a				
*/