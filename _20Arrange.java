import java.util.*;
class _20Arrange
{
    int k,j,p;
    String s,i;
    char ch;
    _20Arrange(String str)
    {
        i="";
        p=0;
        ch=' ';
        s=str;
    }
    void compute()
    {
        p=s.length();
        for(k=65;k<=122;k++)
        {
        for(j=0;j<p;j++)
        {
              ch=s.charAt(j);
              if (ch==(char)k)
              i+=ch;
        }
        }
    }
    void display()
    {
        System.out.println("OUTPUT= "+i);
    }
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        String st;
        System.out.println("ENTER A WORD");
        st=in.nextLine();
        _20Arrange ob=new _20Arrange(st);
        ob.compute();
        ob.display();
    }
}
/*
 * Output:
ENTER A WORD
arrangement
OUTPUT= aaeegmnnrrt
 */