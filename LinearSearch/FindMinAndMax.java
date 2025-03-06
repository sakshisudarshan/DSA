class MinAndMax {
	public static void main(String [] args) {
		int [] arr= {1,3,7,0,10};
		System.out.println(min(arr));
		System.out.println(max(arr));
	}

	public static int min(int [] arr) {
		int ans=arr[0];
		for(int i=1; i< arr.length; i++) {
			if(ans>arr[i]) {
				ans=arr[i];
			}
		}

		return ans;
	}

	public static int max(int [] arr) {
		int ans=arr[0];
		for(int i=1; i<arr.length; i++) {
			if(ans<arr[i]) {
				ans=arr[i];
			}
		}

		return ans;
	}
}
