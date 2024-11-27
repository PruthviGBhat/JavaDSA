import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int arr[] = { 14, 5, 16, 3, 8, 7, 6, 9, 2, 3, 5, 11, 13 };
        Stack<Integer> st = new Stack<>();
        int span[] = new int[arr.length];
        span[0] = 1;
        st.push(0);
        for (int i = 1; i < arr.length-1; i++) {
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                st.pop();                
            }
            if(st.size()==0){
                span[i]=i+1;
            }else{
                span[i]=i-st.peek();
            }
            st.push(i);
        }
        for(int j=0;j<span.length-1;j++){
            System.out.print(span[j]+" ");
        }
    }
}
