package itcaree4u;
import java.util.HashMap;
public class CharCount {
	public static void getCharCount(String name) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		char[] arr = name.toCharArray();
		for (char c : arr) {
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		   }
		char mfc=name.charAt(0);
		for (Character key : hm.keySet()) {
			if(hm.get(key)>hm.get(mfc)) {
				mfc=key;
			}
			System.out.println(key + ":" + hm.get(key));
		}
		System.out.println("Maximum frequency character="+mfc);
	}
	
	public static void main(String[] args) {
//		getCharCount("Testing Test");
		getCharCount("MyTesting One Two Three");
	}

}
