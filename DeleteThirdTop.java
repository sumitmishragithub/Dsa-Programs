import java.util.*;
class DeleteTopThird{
    public void deleteThird(){
        Stack st=new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(70);
        st.push(80);
        System.out.println(st);
        int [] ar=new int[2];
        for(int i=0;i<2;i++){
            int top=(int)st.peek();
            ar[i]=top;
            st.pop();
        }
        st.pop();
        for(int j=ar.length-1;j>=0;j--){
            st.push(ar[j]);
        }
        System.out.println(st);
    }
}
public class DeleteThirdTop
{
	public static void main(String[] args) {
	DeleteTopThird t= new DeleteTopThird();
	t.deleteThird();
	}
}