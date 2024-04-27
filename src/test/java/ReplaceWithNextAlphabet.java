
public class ReplaceWithNextAlphabet {
public static void main(String[] args) {
	String str="my name is aman Kumar";
	String str1="";

    for (int i = 0; i < str.length(); i++) {
    	char c=str.charAt(i);

        if (c == 'a' || c== 'e' || c == 'i' || c == 'o'|| c== 'u')
        {
          str1=str1+(char)(((int)c)+1)   ;
        }
        else 
        	str1=str1+c;
      }
   System.out.println(str1);
   }
}