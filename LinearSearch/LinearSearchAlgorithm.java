class LinearSearch {
	public static void main(String[] args) {
		int [] arr= {1,4,6,3,8};
		int target= 3;
		System.out.println(linearSearch1(arr,target));
		System.out.println();
		System.out.println(linearSearch2(arr,target));
	}

	public static boolean linearSearch1(int [] arr, int target) {
		if (arr.length==0) {
			return false;
		}

		for(int element: arr) {
			if(target==element) {
				return true;
			}
		}
		return false;
	}

	public static int linearSearch2(int[] arr, int target) {
		if (arr.length == 0) {
			return -1;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}
}
