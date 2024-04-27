
public class ReplaceVowelWithSpecialChar {
public static void main(String[] args) {
	String str="My Name Is Aman Kumar";
	str=str.toLowerCase();
	String str1="";

    for (int i = 0; i < str.length(); i++) {
    	char c=str.charAt(i);

        if (c == 'a' ||c=='A'|| c== 'e' ||c=='E'|| c == 'i' ||c=='I'|| c == 'o'||c=='O'|| c== 'u'||c=='U')
        {
          str1=str1+"*"   ;
        }
        else 
        	str1=str1+c;
      }
   System.out.println(str1);
   }
}