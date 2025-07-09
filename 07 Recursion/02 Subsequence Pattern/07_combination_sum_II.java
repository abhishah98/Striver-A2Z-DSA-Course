class Solution {
    public void helper(int[] candidates, int target, int start, List<Integer> curr, List<List<Integer>> ans) {
      // https://leetcode.com/problems/combination-sum-ii/
        if (target == 0) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            // Skip duplicates
            if (i > start && candidates[i] == candidates[i - 1]) continue;

            // If number is too large, break (since array is sorted)
            if (candidates[i] > target) break;

            curr.add(candidates[i]);
            helper(candidates, target - candidates[i], i + 1, curr, ans); 
            curr.remove(curr.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        helper(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }
}
