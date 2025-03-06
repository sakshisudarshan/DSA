import java.util.Arrays; 

class Main {
	public static void main(String [] args) {
		int [] [] arr= {
			{10,20,30},
			{40,50}
		};

		int target=20;
		int [] ans=search(arr,target);
		System.out.println(Arrays.toString(ans)); 

	}

	public static int [] search(int [] [] arr, int target) {

		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(target == arr[i][j]) {
					return new int[] {i,j};
				}

			}
		}
		
		return new int[]{-1,-1};
	}
}
