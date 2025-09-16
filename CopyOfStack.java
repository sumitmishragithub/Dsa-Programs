import java.util.*;
class CopyStack {
    public void doCopy(){
        Stack st=new Stack();
        Stack st1=new Stack();
        st.push(78);
        st.push(23);
        st.push(11);
        st.push(45);
        st.push(8);
        System.out.println(st);
        for(int i=0;i<st.size();i++) {
            int element=(int)st.get(i);
            st1.push(element);
        }
        System.out.println(st1);
    }
}
public class CopyOfStack
{
	public static void main(String[] args) {
	    CopyStack c=new CopyStack();
	    c.doCopy();
	}
}