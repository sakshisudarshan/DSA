class Solution {
    public int numberOfSteps(int num) {
        return helper(num, 0); 
    }

    public int helper(int num, int steps) {
        if (num == 0) {
            return steps;
        }

        if (num % 2 == 0) {
            return helper(num / 2, steps + 1);
        } else {
            return helper(num - 1, steps + 1);
        }
    }
}
