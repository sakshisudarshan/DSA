class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for (int num: nums)
            if (even(num))
                count++;
        return count;
    }
    
    static boolean even(int num){
        int numberOfDigits=digits(num);

        // if(numberOfDigits % 2==0)
        //     return true;
        // else
        //     return false;
        return numberOfDigits % 2==0;
    }

    static int digits (int num){
        int count=0;
        if(num<0)
        {
            num*=-1;
        }
        
        while(num> 0){
            count++;
            num/=10;
        }
      return count;
    }
}
