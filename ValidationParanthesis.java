import java.util.*;
class validstring {
   public void sumo()
    {
        String s="([{}])";
        Stack st=new Stack();
        int flag=0;
        for(int i=0;i<s.length();i++)
        {
        char ch=s.charAt(i);
            if(ch=='['||ch=='{'||ch=='(')
            {
                st.push(ch);
            }
            else
            {
            if(!st.isEmpty()){
            char top=(char)st.peek();
            if(ch==')')
            {
            if(top!='(')
            {
            flag=1;
            break;}
            }
            if(ch=='}' )
            {
            if(top!='{')
            {
            flag=1;
            break;}
            }
            if(ch==']' )
            {
            if(top!='[')
            {
            flag=1;
            break;
                }
            }
            st.pop();
            }
        }
    }
        if(flag==0 && st.isEmpty())
                {
                    System.out.println("valid");
                }
                else
                {
                    System.out.println("invaliddddd");

    }
    
}}

 public class ValidationParanthesis
{
public static void main(String ar[])
{
    validstring v=new validstring();
    v.sumo();
}
}
