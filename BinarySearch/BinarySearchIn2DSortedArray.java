import java.util.Arrays;

public class BinarySearch {

	public static void main(String [] args) {
		int [][] arr= {
			{10,21 },
			{15,23},
			{20,26,100}
		};
		int target= 20;
		System.out.println(Arrays.toString(search(arr,target)));
	}

	public static int [] search (int [][] arr,int target) {
		int row=0;
		int col=arr[0].length-1;

		while(row<arr.length && col>=0) {
			if(target==arr[row][col]) {
				return new int[] {row,col};
			}

			else if(target>arr[row][col]) {
				row++;
			}
			else {
				col--;
			}
		}

		return new int[] {-1,-1};
	}
}
