import java.util.*;
class MidElementDelete{
    public void doMidElementDelete()
    {
        Stack st=new Stack();
        st.push(56);
        st.push(35);
        st.push(78);
        st.push(23);
        st.push(47);
        st.push(89);
        st.push(12);
        System.out.println(st);
        int mid =st.size()/2;
        //System.out.println("mid:"+mid);
        int [] ar=new int[mid];
        int j=0;
        for(int i=0;i<mid;i++)
        {int top=(int)st.peek();
         ar[j]=top;
         j++;
         st.pop();
        }
        st.pop();
        for(int i=j-1;i>=0;i--)
        {
            st.push(ar[i]);
        }
        System.out.println("After mid element delete....");
        System.out.println(st);


        
        

    }
}

public class DelMidElement {
    public static void main(String[] args) {
      MidElementDelete p=new MidElementDelete();
      p.doMidElementDelete();  
    }
    
}
