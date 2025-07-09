class Solution {
// https://leetcode.com/problems/combination-sum/
    public void helper(int[] candidates, int target, int idx, int currSum, List<List<Integer>> ans, List<Integer> curr) {
        if (idx==candidates.length) {
            // base case
            if (currSum == target) {
                ans.add(new ArrayList<>(curr));
            }
            return;
        }
        if (currSum > target) return;

        // include 
        curr.add(candidates[idx]);
        helper(candidates, target, idx, currSum + candidates[idx], ans, curr);

        // exclude
        curr.remove(curr.size() - 1);
        helper(candidates, target, idx + 1, currSum, ans, curr);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(candidates, target, 0, 0, ans, new ArrayList<>());
        return ans;
    }
}
