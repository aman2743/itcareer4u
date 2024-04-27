package itcaree4u;

import java.util.HashMap;

public class NumberCountInAnArray {
public static void main(String[] args) {
	int[] arr= {12,24,12,56,12,13,24,89,10};
	HashMap<Integer,Integer> hm=new HashMap<Integer, Integer>();
	int len=arr.length;
	for(int i=0;i<len;i++) {
		if(hm.containsKey(arr[i])) {
			hm.put(arr[i],hm.get(arr[i])+1);
		}
		else {
			hm.put(arr[i],1);
		}
	}
	int mfi=arr[0];
	for(Integer key:hm.keySet()) {
		System.out.println(key+"::"+hm.get(key));
		if(hm.get(key)>hm.get(mfi)) {
			mfi=key;
		}
	}
	System.out.println("Maximum frequency integer="+mfi+" and frequency= "+hm.get(mfi));
}
}
