import java.util.*;
class ReverseStack{
    public void doReverse() {
        Stack st = new Stack();
        st.push(45);
        st.push(43);
        st.push(23);
        st.push(12);
        System.out.println(st);
        int [] ar= new int [st.size()];
        int j=0;
        while(!st.isEmpty()) {
            int top=(int)st.peek();
            ar[j]=top;
            j++;
            st.pop();
        }
        for (int i=0;i<j;i++) {
            st.push(ar[i]);            
        }
        System.out.println(st);
    }
}
public class StackReverse
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		ReverseStack r= new ReverseStack();
		r.doReverse();
	
	    
	}
}
