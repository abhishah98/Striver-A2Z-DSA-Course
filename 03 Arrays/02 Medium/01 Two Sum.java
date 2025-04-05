// https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {

        // 1. Using Hashing
        // HashMap<Integer , Integer> mp = new HashMap<Integer, Integer>();
        // int[] ans = new int[2];
        // ans[0] = ans[1] = -1;

        // for (int i=0; i<nums.length; i++) {
        //     if (mp.containsKey(target - nums[i])){
        //         ans[0] = mp.get(target-nums[i]);
        //         ans[1] = i;
        //         return ans;
        //     }
        //     mp.put(nums[i], i);
        // }

        // 2. Two Pointers with maintaining the indexes
        
        int[][] mp = new int[nums.length][2];

        for (int i=0; i<nums.length; i++) {
            mp[i][0] = nums[i];// val
            mp[i][1] = i;// idx
        } 
        Arrays.sort(mp, (x, y) -> Integer.compare(x[0], y[0]));
        int i=0, j=mp.length-1, tempSum;
        while (i<j) {
            tempSum = mp[i][0] + mp[j][0];
            if (tempSum == target) {
                return new int[]{mp[i][1],mp[j][1]};
            }
            else if (tempSum < target) {
                i++;
            }
            else {
                j--;
            }
        }
        return new int[]{-1,-1};
    }
}
