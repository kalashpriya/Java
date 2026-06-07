import java.util.*;
class _15EndsVOWEL
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        String s,s1="";
        int i,l,l1;
        char c,r;
        System.out.println("Enter a Sentence");
        s=in.nextLine();
        s=s+" ";
        l=s.length();
        for(i=0;i<l;i++)
        {
            c=s.charAt(i);
            if(c!=' ')
                s1+=c;
            else
            {
                l1=s1.length();
                r=s1.charAt(l1-1);
                if((r=='a')||(r=='e')||(r=='o')||(r=='i')||(r=='u')||(r=='A')||(r=='E')||(r=='I')||(r=='O')||(r=='U'))
                {
                    System.out.println(s1);
                }
                s1="";
            }
        }
    }
}
/*
 Output:
Enter a Sentence
A curious koala gazed at the rainbow, while a piano played softly in the meadow.
A
koala
the
while
a
piano
the
*/