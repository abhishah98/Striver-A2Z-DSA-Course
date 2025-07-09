import java.util.*;

public class Solution {

  // https://www.geeksforgeeks.org/problems/check-if-there-exists-a-subsequence-with-sum-k/1

    public static Boolean[][] memo;

    public static boolean helper(int[] arr, int idx, int currSum, int target) {
        if (currSum == target) return true;

        if (idx == arr.length || currSum > target) return false;

        if (memo[idx][currSum] != null) return memo[idx][currSum];

        boolean take = helper(arr, idx + 1, currSum + arr[idx], target);

        boolean skip = helper(arr, idx + 1, currSum, target);

        return memo[idx][currSum] = take || skip;
    }

    public static boolean checkSubsequenceSum(int N, int[] arr, int K) {
        // Initialize memo table: dimensions = [N][K+1]
        memo = new Boolean[N][K + 1];
        return helper(arr, 0, 0, K);
    }
}
