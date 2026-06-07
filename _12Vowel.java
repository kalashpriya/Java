import java.util.*;
class _12Vowel
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        String s="",w="",ns1="",ns2="";
        int i=0,l=0,lw=0,count=0;
        char c=' ',f=' ',lst=' ';
        System.out.println("Enter a string");
        s=in.nextLine();
        s=s.toUpperCase();
        l=s.length();
        c=s.charAt(l-1);
        if((c=='.')|| (c=='?')||(c== '!'))
        {
            s=s.substring(0,l-1);
            StringTokenizer st=new StringTokenizer(s);
            while(st.hasMoreTokens())
            {
                w=st.nextToken();
                lw=w.length();
                f=w.charAt(0);
                lst=w.charAt(lw-1);
                if(("AEIOU".indexOf(f))>-1 && "AEIOU".indexOf(lst)>-1)
                {
                    count++;
                    ns1=ns1+w+ " ";
                }
                else
                {
                    ns2=ns2+w+ " ";
                }
            }
            System.out.println(count);
            //String str=ns1.toString()+ns2.toString();
            System.out.println(ns1+ns2);
        }
    }
}
/*
   Output:
Enter a string
The curious fox danced under neon skies while humming a forgotten tune.
1
A THE CURIOUS FOX DANCED UNDER NEON SKIES WHILE HUMMING FORGOTTEN TUNE
*/