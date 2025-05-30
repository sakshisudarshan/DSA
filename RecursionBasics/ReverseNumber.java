public class Main
{
	public static void main(String[] args) {
		int n=278;
		int r=0;
		int ans=rev(n,r);
		System.out.println(ans);
	}
	
	public static int rev(int n,int r){
	    if(n==0){
	        return r;
	    }	    
	    return rev(n/10, r*10+n%10);
	}
}
