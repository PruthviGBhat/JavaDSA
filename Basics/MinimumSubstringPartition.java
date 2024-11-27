import java.util.HashSet;

public class MinimumSubstringPartition {  
    public static int partitionString(String s) {
        int result=1;
        HashSet<Character> set = new HashSet<>();
        for(char ch : s.toCharArray()){
            if(set.contains(ch)){
                result++;
                set.clear();
            }
            set.add(ch);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(partitionString("abacccd")); 
    }
}
