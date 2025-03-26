public class OrderAgnosticBinarySearch {

	public static void main (String [] args) {

		int [] arr= {0,3,5,6,7,9};
		int target=7;
		System.out.print(orderAgnosticBinarySearch(arr,target));

	}

	public static int orderAgnosticBinarySearch(int [] arr, int target) {

		int start =0;
		int end=arr.length-1;

		boolean isAsc;
		if(arr[start]<arr[end]) {
			isAsc=true;
		}
		else {
			isAsc=false;
		}

		while(start<=end) {

			int mid=start+(end-start)/2;

			if(target == arr[mid]) {
				return mid;
			}

			if(isAsc) {
				if(target>arr[mid]) {
					start=mid+1;
				}
				else if(target< arr[mid]) {
					end=mid-1;
				}
			}

			else {
				if(target>arr[mid]) {
					end=mid-1;
				}
				else if(target<arr[mid]) {
					start=mid+1;
				}
			}

		}
		return -1;
	}
}
