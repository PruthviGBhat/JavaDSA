import java.util.*;

public class FrequencyOfCharacters {
	public static void main(String[] args) {
		String str="abrakadabra";
		HashMap<Character,Integer> hm = new HashMap<>();
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(hm.containsKey(ch)) {
				int of  = hm.get(ch);
				int nf = of + 1;
				hm.put(ch,nf);
			} else {
				hm.put(ch,1);
			}
		}
		for(Character key:hm.keySet()) {
			Integer val = hm.get(key);
			System.out.println(key+" "+val);
		}

	}
}
