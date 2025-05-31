public class Main
{
	public static void main(String[] args) {
		int [] arr={1,2,3,4,9};
		int index =0;
		System.out.println(sorted(arr,index));
	}
	
	public static boolean sorted(int [] arr,int index){
	    if(index==arr.length-1){
	        return true;
	    }
	    
	    return arr[index]<arr[index+1] && sorted(arr,index+1);
	}
}
