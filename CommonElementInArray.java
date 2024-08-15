import java.util.*;

public class CommonElementInArray{
	public static void main(String[] args) {
		int arr1[]={1,8,4,3,4,1,8,5,7};
		int arr2[]={5,7,8,1,4,9,6,2};
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int val:arr1){
		    if(hm.containsKey(val)){
		        int of = hm.get(val);
		        int nf = of + 1;
		        hm.put(val,nf);
		    }else{
		        hm.put(val,1);
		    }
		}
		for(int val:arr2){
		    if(hm.containsKey(val)){
		        System.out.print(val+" ");
		        hm.remove(val);
		    }
		}
	}
}
