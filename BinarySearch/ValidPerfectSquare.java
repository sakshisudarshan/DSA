class Solution {
    public boolean isPerfectSquare(int num) {

        if (num==0 || num==1){
            return true;
        }

        int start=1;
        int end = num;

        while(start<=end){
            int mid=(start)+(end-start)/2;

            if((long)mid*mid==(long)num){
                return true;
            }

            else if((long)mid*mid>(long)num){
                end=mid-1;
            }

            else if((long)mid*mid<(long)num){
                start=mid+1;
            }
        }

        return false;
    }
}
