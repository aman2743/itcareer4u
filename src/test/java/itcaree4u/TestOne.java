package itcaree4u;

public class TestOne {
	public static void main(String[] args) {
		String str = "AMAN KUMAR";
		String[] arr = str.split(" ");
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			if (i == 0) {
				String st = arr[i];
				for (int j = st.length() - 1; j >= 0; j--) {
					System.out.print(st.charAt(j));
				}
			}
			System.out.print(" ");
			if (i == 1) {
				String st = arr[i];
				System.out.print(st);
			}

		}
	}
}