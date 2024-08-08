import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String str = "[{(a+b)-(c-d){a*b}}";
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (st.isEmpty()) {
                    System.out.println("false");
                    break;
                } 
                char top = st.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    System.out.println("false");
                    break;
                }
            }
        }

        if (!st.isEmpty()) {
            System.out.println("false");
        }else{
            System.out.println("true");
        }
    }
}
