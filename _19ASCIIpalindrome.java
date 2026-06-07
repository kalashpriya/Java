import java.util.*;
class _19ASCIIpalindrome
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,l,j,sum=0,sum2=0;
        String s,w,st="";
        char c,ch;
        System.out.println("Enter a word");
        w=in.next();
        l=w.length();
        for(j=l-1;j>=0;j--)
        {
            c=w.charAt(j);
            st+=c;
            sum+=(int)c;
        }
        if(st.equalsIgnoreCase(w))
            System.out.println("It is palindrome. ASCII VALUE="+sum);
        else
        {
            sum2=w.charAt(0)+w.charAt(l-1);
            System.out.println("It is not palindrome. ASCII VALUE="+sum2);
        }
    }
}
/*
 Output:
Enter a word
madam
It is palindrome. ASCII VALUE=512 
*/