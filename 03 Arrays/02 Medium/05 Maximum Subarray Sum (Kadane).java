// Leetcode: https://leetcode.com/problems/maximum-subarray/

class Solution {
    public int maxSubArray(int[] nums) {
        /*
        1. Brute Force:
        - Iterate through ALL Subarrays and then find their sum
        O(n^3)

        2. Better:
        - We can reduce the last loop by taking the sum and comparing with others
        for (0->n-1)
        {
            sum = 0
            for(i->n-1){
                add sum and take maximum
            }
        }

        3. Optimal:
        Kadane's Algorithm
        Take the current sum, track the maximum separately. When you find negative sum, simply ignore.
        */

        int ans=Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i<nums.length; i++) {
            sum += nums[i];
            ans = Math.max(ans, sum);
            if (sum<0) sum=0; 
        }
        return ans;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)

