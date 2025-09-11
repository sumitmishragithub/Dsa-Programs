import java.util.*;
class MyStack{
    public void doStack()
    {
        Stack st=new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println("The Stack is:"+st);
        int top=(int)st.peek();
        System.out.println("Top :"+top);

        
        st.pop();
        boolean b=st.isEmpty();
        System.out.println("boolean is:"+b);
        int noOfElements=st.size();
        System.out.println("no of elements:"+noOfElements);
        for(int i=0;i<st.size();i++)
        {
            System.out.println(st.get(i)+" element "+(i+1));
        }

    }
}
public class Stack1 {
public static void main(String[] args) {
    MyStack my=new MyStack();
    my.doStack();
}
}