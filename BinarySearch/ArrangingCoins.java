class Solution {
    public int arrangeCoins(int n) {
        
        long start =1;
        long end=n;

        while(start<=end){
            long mid=start+(end-start)/2;
            long coinCount=(mid*(mid+1))/2;

            if(coinCount<n){
                start=mid+1;
            }

            else if(coinCount>n){
                end=mid-1;
            }

            else if(coinCount==n){
                return (int)mid;
            }
        }
        return (int)end;
    }
}
