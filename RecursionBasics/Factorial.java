public class Main
{
	public static void main(String[] args) {
		System.out.println(fact(4));
	}
	
	static int fact(int n){
	    if(n==1 || n==0){
	        return 1;
	    }
        return n*fact(n-1);
	}
}
