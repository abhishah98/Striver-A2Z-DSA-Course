class Solution {
    public void helper(int[] nums, int idx, List<List<Integer>> ans, List<Integer> curr) {
      // https://leetcode.com/problems/subsets/
        if (idx == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        // include
        curr.add(nums[idx]);
        helper(nums, idx + 1, ans, curr);
        // exclude
        curr.remove(curr.size() - 1);
        helper(nums, idx+1, ans, curr);

    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums, 0, ans, new ArrayList<>());
        return ans;
    }
}
