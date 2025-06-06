class Main {
    
    public static void main(String []args){
        int [] nums={2,2,9,2,2,2,2};
        System.out.print(findPivotWithDuplicates(nums));
    }
    public static int search(int[] nums, int target) {
        int pivot=findPivotWithDuplicates(nums);
        if(pivot==-1){
            return binarySearch(nums,target,0,nums.length-1);
        }

        if(target==nums[pivot]){
            return pivot;
        }

       if(target>=nums[0]){
            return binarySearch(nums,target,0,pivot-1);
        }

        return binarySearch(nums,target,pivot+1,nums.length-1);

    }

    public static int binarySearch(int [] nums,int target,int start,int end){

        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==nums[mid]){
                return mid;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }

    public static int findPivotWithDuplicates(int[]nums){
    
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }

           if (nums[mid]==nums[start] && nums[mid]==nums[end]){
               
               if(nums[start]>nums[start+1]){
                   return start;
               }
               start++;
               
               if(nums[end]<nums[end-1]){
                   return end-1;
               }
               end--;
           }
           else if(nums[start]<nums[mid] || (nums[start]==nums[mid] && nums[mid]>nums[end])){
               start=mid+1;
           }
           else{
               end=mid-1;
           }
        }
        return -1;
    }
}
