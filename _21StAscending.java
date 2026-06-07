import java.util.*;
class _21StAscending
{
    public static void main()//main function
    {
        Scanner in = new Scanner(System.in);
        int i,j,l,c;
        //accepting inputs
        System.out.println("Enter a sentence:");//print statement
        String s=in.nextLine();
        String str=s;
        l=s.length();
        char ch=s.charAt(l- 1);//character extraction
        if((ch!='.')||(ch!='.')||(ch!='.'))//if condition 
        {
            System.out.println("Invalid Input!");
            System.out.println("Sentence should end with full stop.");
            return;
        }//if condition closed
        if(Character.isUpperCase(s.charAt(0)))//if condition
        {
            System.out.println("Invalid Input!");
            System.out.println("Sentence should be in lowercase");
            return;
        }//if condition closed
        System.out.println("Input String:");
        System.out.println(Character.toUpperCase(s.charAt(0))+s.substring(1,l));
        String s2=s.charAt(0)+s.substring(1,(l-1));//making new string
        StringTokenizer st=new StringTokenizer(s2);//string tokenizer
        c=st.countTokens();//counter
        String SA[]=new String[c];
        for(i=0;i<c;i++) //for loop
            SA[i]=st.nextToken();
        for(i=0;i<c-1;i++)//for loop
        {
            for(j=0;j<c-i-1;j++) //for loop
            {
                if(SA[j].length()>SA[j+1].length()) //sorting
                {
                    String t=SA[j];
                    SA[j]=SA[j+1];
                    SA[j+1]=t;
                }
            }//loop closed
        }//loop closed
        SA[0]=Character.toUpperCase(SA[0].charAt(0))+SA[0].substring(1);
        System.out.println("Output String:");
        for(i=0;i<c;i++)//for loop
        {
            System.out.print(SA[i]);//print statement
            if (i==c-1) 
                System.out.print(".");
            else
                System.out.print(" ");
        }//loop closed
    }
}
/*
 * Output:
Enter a sentence:
the lines are printed in reverse order.
Input String:
The lines are printed in reverse order.
Output String:
In the are lines order printed reverse.
 */