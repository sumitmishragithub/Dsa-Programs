import java.util.Stack;

class InsBottom {
    public void bottom() {
        Stack st = new Stack();
        st.push(56);
        st.push(35);
        st.push(78);
        st.push(23);
        st.push(47);
        st.push(89);
        st.push(12);
        System.out.println(st);
        int siz = st.size();
        int j = 0;
        int[] ar = new int[siz];
        for (int i = 1; i <= siz; i++) {
            int top = (int) st.peek();
            ar[j] = top;
            j++;
            st.pop();
        }
        st.push(10);
        for (int i = j - 1; i >= 0; i--) {
            st.push(ar[i]);
        }
        System.out.println("The new stack is:" + st);
    }
}

public class InsBottomElement {
    public static void main(String[] args) {
        InsBottom in = new InsBottom();
        in.bottom();
    }
}
