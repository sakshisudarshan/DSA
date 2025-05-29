public class Main
{
	public static void main(String[] args) {
		nto1(5);
	}
	
	static void nto1(int n){
	    if(n==0){
	        return;
	    }
	    System.out.println(n);
	    nto1(n-1);
	}
}
