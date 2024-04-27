package itcaree4u;

public class StringNew {
	public static void main(String[] args) {
		String s = "The rain has started herssa";
		int count = 0, temp = 0, n = 3;
		int len = s.length();
		char x = 'a';
		for (int i = 0; i < len; i++) {
			temp++;
			char c = s.charAt(i);
			if (c == x) 
			  {
				count++;
				if (count == n) 
				   {
					System.out.println(n + " occurance of character " + x + " is at index " + i);
					break;
				   } 
				
			   }
			if (temp == len-1) 
			{
				System.out.println("Character not found at provided occurance");
				break;
			}

		}
	}
}
