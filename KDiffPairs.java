import java.util.*;

public class KDiffPairs {
    public static int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int of = map.get(nums[i]);
                int nf = of + 1;
                map.put(nums[i], nf);
            } else {
                map.put(nums[i], 1);
            }
        }
        int count = 0;
        Set<Integer> set = map.keySet();
        for (int setnum : set) {
            if (k == 0 && map.get(setnum) > 1) {
                count++;
            } else if (k > 0 && map.containsKey(setnum + k)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 5, 1, 2, 3, 4, 5 };
        int k = 2;
        int result = findPairs(nums, k);
        System.out.println("Number of k-diff pairs: " + result);
    }
}