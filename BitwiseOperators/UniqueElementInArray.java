public class Main
{
	public static void main(String[] args) {
		int [] arr={1,2,3,4,5,5,4,1,3};
		System.out.println(uniqueElement(arr));
	}
	
	public static int uniqueElement(int [] arr){
	    int ans=0;
	    for(int n: arr){
	        ans^=n;
	    }
	    return ans;
	}
}
