public class BinarySearchUsingRecursion
{
	public static void main(String[] args) {
		int [] arr= {1,2,5,8,9,10};
		int s=0;
		int e=arr.length-1;
		int target=8;

		System.out.println(binarySearch(arr,target,s,e));
	}

	public static int binarySearch(int [] arr, int target, int s, int e) {
		if(s>e) {
			return -1;
		}

		int m=s+(e-s)/2;

		if(arr[m]==target) {
			return m;
		}

		if(arr[m]>target) {
			return binarySearch(arr,target,s,m-1);
		}

		return binarySearch(arr,target,m+1,e);
	}
}
