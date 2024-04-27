package itcaree4u;

public class RecursiveCall {

	int countWays(int n) {
		if(n==1||n==2) {
			return n;
		}
	 int recCall1=countWays(n-1);
	 int recCall2=countWays(n-2);
	 int smallCal=recCall1+recCall2;
	 return smallCal;
	}
	
	public static void main(String[] args) {
		RecursiveCall rc=new RecursiveCall();
        int cnt=rc.countWays(7);
        System.out.println(cnt);
	}

}
