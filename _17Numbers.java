import java.util.*;
class _17Numbers
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,l,a=0,b=0,c=0,d=0;
        String s;
        char r;
        System.out.println("Enter a String");
        s=in.nextLine();
        l=s.length();
        
        for(i=0;i<l;i++)
        {
            r=s.charAt(i);
            if(r==' ')
            continue;
            if(Character.isLetter(r))
            {
                if (Character.isLowerCase(r))
                    a++;
                else if(Character.isUpperCase(r))
                    b++;
            }
            else if(Character.isDigit(r))
            c++;
            else
            d++;
        }
        System.out.println("The number of lowercase characters="+a);        
        System.out.println("The number of uppercase characters="+b);
        System.out.println("The number of digits ="+c);
        System.out.println("The number of special characters="+d);
    }
}
/*
 Output:
Enter a String
A paper boat sailed quietly down a rain-soaked street, carrying the dreams of a child who believed it could reach the ocean.
The number of lowercase characters=99
The number of uppercase characters=1
The number of digits =0
The number of special characters=3
*/