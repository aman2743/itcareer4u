import java.util.HashMap;

public class MaximumFrequencyCharacter {
	public static void main(String[] args) {
		String str = "My name is raman kumar gangwar rawat";
		int len = str.length();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < len; i++) {
			char c = str.charAt(i);
			if (c == ' ') {
				continue;
			} else if (hm.containsKey(c)) {
				int of = hm.get(c);
				int nf = of + 1;
				hm.put(c, nf);
			} else {
				hm.put(c, 1);
			}
		}
		char mfc = str.charAt(0);
		for (Character key : hm.keySet()) {
			System.out.println(key + ":" + hm.get(key));
			if (hm.get(key) > hm.get(mfc)) {
				mfc = key;
			}
		}
		System.out.println("Highest Frequency Character=" + mfc);
	}

}