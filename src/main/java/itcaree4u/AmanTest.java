package itcaree4u;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
public class AmanTest {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		Collections.addAll(al, 10, 11, 10, 11, 10, 11, 10, 11, 12);
		HashSet<Integer> hs=new HashSet<Integer>();
//		al.add(10);
//		al.add(11);
//		al.add(10);
//		al.add(11);
//		al.add(10);
//		al.add(11);
//		al.add(10);
//		al.add(11);
//		al.add(12);
//		al=[10, 11, 10, 11, 10, 11, 10, 11, 12];
		System.out.println(al);
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext()){
		  hs.add(itr.next());
		}
		System.out.println(hs);
	}
}