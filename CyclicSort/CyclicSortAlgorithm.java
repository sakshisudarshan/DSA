import java.util.*;

public class CyclicSortAlgorithm {
	public static void main(String[] args) {
		int [] arr= {3,2,1,5,4};
		cyclicSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void cyclicSort(int [] arr) {
		int i=0;
		while(i<arr.length -1) {
			int correct=arr[i]-1;

			if(arr[i]!=arr[correct]) {
				int temp=arr[i];
				arr[i]=arr[correct];
				arr[correct]=temp;
			}

			else {
				i++;
			}
		}
	}
}
