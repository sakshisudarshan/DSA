import java.util.Scanner;

public class CeilingOfNumber{
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in array \n");
        int n= sc.nextInt();
        int [] arr =new int[n];
        System.out.print("Enter the array elements\n");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.print("The array contains\n");
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.print("\n");
        System.out.print("Enter target element\n");
        int target=sc.nextInt();
        
        int ans=ceiling(arr,target);
        System.out.print("The ceiling value's index is "+ans );
    }
    
    public static int ceiling(int [] arr,int target){
        int start=0;
        int end=arr.length-1;

        if(target>arr[arr.length-1]){
            return -1;
        }
        
        while(start<=end){
            int mid= start+(end-start)/2;
            
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            
            else{
                return mid;
            }
        }
        return start;
    }
}
