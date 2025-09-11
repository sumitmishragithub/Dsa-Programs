import java.util.*;
class reverseString
{
    public void doReverseString()
    {
        Stack st=new Stack();
        String s="India123";
        String revString="";
        for (int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            st.push(ch);
        }
        while (!st.isEmpty())
        {
            char ch=(char)st.peek();
            revString=revString+ch;
            st.pop();
        }
        System.out.println("Reverse String is:"+ revString);
     }
}


public class Reverse {
    public static void main()
    {
        reverseString r=new reverseString();
        r.doReverseString();
    }
    
}
