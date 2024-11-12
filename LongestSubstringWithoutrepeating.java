import java.util.*;
class LongestSubstringWithoutrepeating {
    public static int lengthOfLongestSubstring(String s) {
        int count = 0;
        HashMap<Character, Integer> h = new HashMap<>();
        char letters[] = s.toCharArray();
        int windowStart = 0;
        for (int i = 0; i < letters.length; i++) {
            char ch = letters[i];
            if (h.containsKey(ch)) {
                windowStart = Math.max(windowStart, h.get(ch) + 1);
            }
            h.put(ch, i); 
            count = Math.max(count, i - windowStart + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(lengthOfLongestSubstring(str)); 
    }
}