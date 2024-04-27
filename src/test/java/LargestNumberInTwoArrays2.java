import java.util.Arrays;

public class LargestNumberInTwoArrays2 {
	public static void main(String[] args) {
		int[] arr1 = { 23, 56, 122, 677, -10, 812 };
		int[] arr2 = { 12, 23, 812, 60, 1, 51 };

		int largest = arr1[0];
		for (int i = 1; i < arr1.length; i++) {
			if (arr1[i] > largest) {
				largest = arr1[i];
			}
		}
		for (int j = 0; j < arr2.length; j++) {
			if (arr2[j] > largest) {
				largest = arr2[j];
			}
		}

//		System.out.println("Given array is:"+Arrays.toString(arr));
		System.out.println("Largest number=" + largest);
	}
}
