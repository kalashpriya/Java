import java.util.*;
class _18Special
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,l,j,k=0;
        String s,w="",s1="",s2="";
        char c,r;
        System.out.println("Enter a String");
        s=in.nextLine();
        s=s+" ";
        s=s.toLowerCase();
        l=s.length();
        System.out.println();
        for(i=0;i<l;i++)
        {
            c=s.charAt(i);
            if(c!=' ')
                w+=c;
            else
            {
                for(j=0;j<w.length();j++)
                {
                    r=w.charAt(j);
                    if((Character.isDigit(r))||(!(Character.isLetterOrDigit(r)))||(r=='a')||(r=='e')||(r=='o')||
                    (r=='i')||(r=='u'))
                    {
                        k++;
                    }
                }
                if(k>0)
                System.out.print(w+" ");
                w="";
                k=0;
            }     
        }   
    }
}
/*
 Output:
Enter a String
Hello! my name is Kalash123 and I love coding@night with friends.

hello! name is kalash123 and i love coding@night with friends. 
*/