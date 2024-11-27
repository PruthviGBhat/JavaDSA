import java.util.Stack;
public class NextGreaterElement {
    public static void main(String[] args) {
        int[] nums = {4,1,2,5,7,9,11,4,6};
        Stack<Integer> st = new Stack<>();
        int res[] = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= nums[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                res[i] = -1; 
            } else {
                res[i] = st.peek();
            }

            st.push(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print( res[i]+"\t");
        }
    }
}
