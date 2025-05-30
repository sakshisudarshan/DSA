public class Main
{
	public static void main(String[] args) {
		int n=878;
		int r=0;
		if(n==rev(n,r)) {
			System.out.println("Is Palindrome");
		}

		else {
			System.out.println("Is Not Palindrome");
		}
	}

	public static int rev(int n,int r) {
		if(n==0) {
			return r;
		}

		return rev(n/10, r*10+n%10);
	}
}
