package itcaree4u;
public class NthIndex {
	public static void main(String[] args) {
		String s="The rain has started herssas";
		GetNthIndex(s,'s',6);
	}

	public static void GetNthIndex(String s, char t, int n)
	{
		int count =0,temp=0;
		int len=s.length();
		for (int i = 0; i <len; i++) {
			temp++;
			char c = s.charAt(i);
			if (c == t)	{
				count++;
			 if (count == n) {
					System.out.println(n+" occurance of character "+t+" is at index " + i);
					break;
				}
			 else if(temp==len) {
					System.out.println("Character not found at provided occurance");
					break;
				}
			 }
			
			}
		}
}
