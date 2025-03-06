class SearchInRange {
	public static void main (String [] args) {
		int [] arr= {1,5,7,4,6};
		int target=4;
		int start=3;
		int end=4;
		System.out.print(linearSearch(arr,target,start,end));
	}

	public static int linearSearch(int [] arr, int target, int start,int end) {
		if(arr.length == 0) {
			return -1;
		}

		for(int i=start; i<=end; i++) {
			if(target==arr[i]) {
				return i;
			}
		}

		return -1;
	}
}
