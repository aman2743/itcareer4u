import java.util.HashMap;

public class Tes123 {
	// Online Java Compiler
	// Use this editor to write, compile and run your Java code online
	    public static void main(String[] args) {
	        String str="my name is aman kumar";
	        int len=str.length();
	    HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
	    for(int i=0;i<len;i++){
	        char c=str.charAt(i);
	        if(hm.containsKey(c)){
	            hm.put(c,hm.get(c)+1);
	        }
	        else{
	            hm.put(c,1);
	        }
	    }
	    char mfc=str.charAt(0);
	    for(Character key:hm.keySet()){
	        if(hm.get(key)>hm.get(mfc)){
	            mfc=key;
	        }
	        
	    }   
	    System.out.println(mfc);
	    }
	}
