import java.util.*;

class RedundantExpression {
    public void docheck() {
        String s = "(a+((b+c)))";
        Stack st = new Stack();
        int flag = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                st.push(ch);
            } else {
                if (ch == ')') {
                    flag = 0;
                    while ((char)st.peek() != '(' ) {
                        char top = (char) st.peek();
                        if (top == '+' || top == '*' || top == '-' || top == '/') {
                            flag = 1;
                        }
                        st.pop();
                    }
                    if(flag==0)
                        {
                            break;
                        }
                    st.pop();
                }
                
            }
        }
        if (flag == 0) {
            System.out.println("Redundant");
        } else {
            System.out.println("not redundant");
        }

    }

}

public class Redundancy {
    public static void main(String[] args) {
        RedundantExpression r = new RedundantExpression();
        r.docheck();

    }

}
