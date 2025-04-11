import java.util.Arrays;

public class BinarySearch {

	public static void main(String [] args) {
		int [][] arr= {
			{1,2,3,4 },
			{5,6,7,8},
			{9,10,11,12}
		};
		int target= 10;
		System.out.println(Arrays.toString(search(arr,target)));
	}

	public static int[] binarysearch(int [][] arr,int row,int cStart,int cEnd,int target) {

		while(cStart<=cEnd) {
			int mid= cStart+(cEnd-cStart)/2;

			if(arr[row][mid]==target) {
				return new int[] {row,mid};
			}

			else if(arr[row][mid]<target) {
				cStart=mid+1;
			}
			else {
				cEnd=mid-1;
			}
		}
		return new int[] {-1,-1};
	}

	public static int [] search (int [][] arr,int target) {
		int rows=arr.length;
		int cols=arr[0].length-1;

		int rStart=0;
		int rEnd= rows-1;
		int mCol=cols/2;

		if(rows==1) {
			return binarysearch(arr,0,0,cols-1,target);
		}
		//more than 2 rows
		while(rStart<(rEnd-1)) {
			int mid=rStart+(rEnd-rStart)/2;

			if(arr[mid][mCol]==target) {
				return new int[] {mid,mCol};
			}

			else if(arr[mid][mCol]<target) {
				rStart=mid;
			}

			else {
				rEnd=mid;
			}
		}

		//we have 2 rows

		if(arr[rStart][mCol]==target) {
			return new int[] {rStart,mCol};
		}

		if(arr[rStart+1][mCol]==target) {
			return new int[] {rStart+1,mCol};
		}

		//search in 1st half

		if(target<= arr[rStart][mCol-1]) {
			return binarysearch(arr,rStart,0,mCol-1,target);
		}

		//search in 2nd half
		if(target>= arr[rStart][mCol+1] && target<=arr[rStart][cols-1]) {
			return binarysearch(arr,rStart,mCol+1,cols-1,target);
		}

		//search in 3rd half
		if(target<= arr[rStart+1][mCol-1]) {
			return binarysearch(arr,rStart+1,0,mCol-1,target);
		}

		//search in 4th half
		if(target>= arr[rStart+1][mCol+1]) {
			return binarysearch(arr,rStart+1,mCol+1,cols-1,target);
		}
		return new int[] {-1,-1};
	}
}
