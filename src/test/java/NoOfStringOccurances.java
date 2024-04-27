import java.util.HashMap;
public class NoOfStringOccurances {
    public static void main(String[] args) {
        String str="Selenium Waits are the mechanism that allows the automation script to pause the execution and wait until certain conditions are met before throwing an error if the element is not found. Selenium Waits helps to synchronize the execution script with the loading time of the website. There are two types of Waits In Selenium they are Implicit Waits: Implicit Waits is a type of wait which instruct the Web Driver to wait for specific amount of time before throwing an error. It is applied globally.Explicit Waits: Explicit wait is a type of wait which instructs the Web Driver to wait until a certain condition is met or maximum type is elapsed.";

String[] strarr=str.split(" ");

HashMap<String,Integer> hm=new HashMap<String,Integer>();
for(String str1:strarr){
    if(hm.containsKey(str1)){
       hm.replace(str1,hm.get(str1)+1) ;
    }
    else{
        hm.put(str1,1);
    }
}


for(String key:hm.keySet()){
    System.out.println(key+":"+hm.get(key));
}

    }
}