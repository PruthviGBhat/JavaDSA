import java.util.*;

public class CommonElementInArray{
	public static void main(String[] args) {
		int arr1[]={1,2,3,4,5};
		int arr2[]={5,6,7,8,9};
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
