import java.util.*;
class _14CaesarCipher
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,k,l;
        String s,New="";
        char ch;
        System.out.println("Enter text");
        s=in.nextLine();
        l=s.length();
        if((l<=3 )||(l>=100))
        System.out.println("Invalid Input");
        else
        {
            for(i=0;i<l;i++)//for loop
            {
                ch=s.charAt(i);
                if(Character.isLetter(ch))//if condition
                {
                    k=(int)ch;//ascii
                    if((k>77)&&(k<=90)||(k>109)&&(k<=122))
                    k=k-13;//converting
                    else
                    k=k+13;//converting
                    ch=(char)k;//converting to character
                }
                New=New+ch;
            }
            System.out.println("The Caesar Cipher text is :");
            System.out.println(New);//print statement
        }
    }
}
/*
 Output:
Enter text
Hello! How are you?
The Caesar Cipher text is :
Uryyb! Ubj ner lbh?
*/