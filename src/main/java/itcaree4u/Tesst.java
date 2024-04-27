package itcaree4u;
import java.util.TreeSet;
public class Tesst {
	public static void main(String[] args) {
		int[] arr= {2,5,1,4};
		TreeSet<Integer> ts=new TreeSet<Integer>();
//		Arrays.sort(arr);
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
		
		
		for(int i=0;i<arr.length;i++) {
			ts.add(arr[i]);
		}
		System.out.println(ts);
	}
}