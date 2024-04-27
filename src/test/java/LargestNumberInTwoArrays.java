import java.util.Arrays;

public class LargestNumberInTwoArrays {
	public static void main(String[] args) {
		int []arr1= {23,56,122,6777,-10,5};
		int []arr2= {12,23,112,60,1,51};
		int largest=arr2[0];
		for(int i=0;i<arr1.length;i++) {
			for(int j=1;j<arr2.length;j++) {
				if(arr2[j]>largest) {
					largest=arr2[j];
				}
				else if(arr1[i]>largest) {
					largest=arr1[i];
				}
			}	
		}
//		System.out.println("Given array is:"+Arrays.toString(arr));
		System.out.println("Largest number="+largest);

	}

}
