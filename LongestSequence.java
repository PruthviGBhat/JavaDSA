import java.util.*;

public class LongestSequence{
	public static void main(String[] args) {
		int arr[]= {1,5,9,4,6,2,11,13,14};
		HashMap<Integer,Boolean> hm = new HashMap<>();
		for(int val:arr) {
			hm.put(val,true);
		}
		for(int val:arr) {
			if(hm.containsKey(val-1)) {
				hm.put(val,false);
			}
		}

        int maxlength=0;
        int maxstartpoint=0;
		for(int val:arr) {
			if(hm.get(val)==true) {
				int templength=1;
				int tempstartpoint=val;
				while(hm.containsKey(tempstartpoint+templength)){
				    templength++;
				}
				if(maxlength<templength){
				    maxstartpoint=tempstartpoint;
				    maxlength=templength;
				}
			}
		}
		System.out.println(maxlength);
		for(int i=0;i<maxlength;i++){
		    System.out.print(maxstartpoint+i+" ");
		}
	}
}
