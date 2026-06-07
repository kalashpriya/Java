import java.util.*;
class _13Pangram
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        String s="",w="",longg="",shortt="",st="",w2="";
        int i=0,j=0,l=0,max=0,min=50,count=0,lw=0,lw2;
        char c=' ';
        System.out.println("Enter a string");
        s=in.nextLine();    l=s.length();
        st=s.toUpperCase();
        for(i=65;i<=90;i++)
        {
            for(j=0;j<l;j++)
            {
                if(st.charAt(j)==((char)i))
                    count++;
            }
        }
        s=s.substring(0,l-1);
        StringTokenizer str=new StringTokenizer(s);
        while(str.hasMoreTokens())
        {
            w=str.nextToken();
            lw=w.length();
            if(max<lw)
            {
                max=lw;
                longg=w;
            }
            if(min>lw)
            {
                min=lw;
                shortt=w;
            }
        }
        if(count>25)
            System.out.println("Pangram");
        else
            System.out.println("Not Pangram");
        System.out.println("Longest-"+longg);
        System.out.println("Shortest-"+shortt);
    }
}
/*
   Output:
Enter a string
The quick brown fox jumps over the lazy dog.
Pangram
Longest-quick
Shortest-The
*/