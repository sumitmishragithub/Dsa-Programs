import java.util.*;
class GreatestElementFind {
    public void doFind(){
        Stack st=new Stack();
        st.push(78);
        st.push(23);
        st.push(11);
        st.push(45);
        st.push(8);
        System.out.println(st);
        int max = (int)st.get(0);
        for(int i=0;i<st.size();i++) {
            if ((int)st.get(i)>max)
            {
                max=(int)st.get(i);
            }
        }
        System.out.println(max);
    }
}
public class GreatestElement
{
	public static void main(String[] args) {
		GreatestElementFind g= new GreatestElementFind();
		g.doFind();
	}
}