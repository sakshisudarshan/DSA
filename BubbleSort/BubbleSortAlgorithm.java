import java.util.*;

public class BubbleSortAlgorithm {
	public static void main(String[] args) {
		int [] arr= {10,5,3,16,11};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void bubbleSort(int [] arr) {

		for(int i=0; i<arr.length; i++) {
			for(int j=1; j<arr.length-i; j++) {
				if (arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
	}
}
