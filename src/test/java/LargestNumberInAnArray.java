import java.util.Arrays;

public class LargestNumberInAnArray {
	public static void main(String[] args) {
		int []arr= {23,56,12,67,-10,5};
		int largest=arr[0];
		int smallest=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
			else if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		System.out.println("Given array is:"+Arrays.toString(arr));
		System.out.println("Largest number="+largest);
		System.out.println("Smallest number="+smallest);
	}

}
