import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KFrequentElement {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num)){
                int of = map.get(num);
                int nf = of + 1;
                map.put(num,nf);
            }else{
                map.put(num,1);
            }
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b)->map.get(b)-map.get(a));
        int result[] = new int[k];
        int index=0;
        for(int i=0;i<k;i++){
            result[index]=list.get(i);
            index++;
        }
        return result;
    }
    public static void main(String[] args) {
        int nums[] = {1,1,1,2,3,3,4};
        int k=2;
        int result[] = topKFrequent(nums,k);
        for(int temp:result){
            System.out.print(temp+" ");
        }
    }
}
