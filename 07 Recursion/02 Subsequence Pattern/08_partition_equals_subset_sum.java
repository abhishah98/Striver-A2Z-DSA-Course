class Solution {
  //https://leetcode.com/problems/partition-equal-subset-sum/
    public boolean helper(int[] nums, int idx, int currSum, int target, Boolean[][] memo) {
        if (idx == nums.length) {
            if (currSum==target) {
                return true;
            }
            return false;
        }
        if (currSum > target) return false;
        if (memo[idx][currSum] != null) return memo[idx][currSum];
        boolean include = helper(nums, idx + 1, currSum+nums[idx], target, memo);
        boolean exclude = helper(nums, idx + 1, currSum, target, memo);
        memo[idx][currSum] = include || exclude;
        return memo[idx][currSum];
    }
    public boolean canPartition(int[] nums) {
        // first calculate the sum
        int sum=0;
        for (Integer i: nums) sum += i;
        if (sum%2 == 1) return false;
        sum = sum/2;
        Boolean[][] memo = new Boolean[nums.length][sum + 1];
        return helper(nums, 0, 0, sum, memo);
    }
}
