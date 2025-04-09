class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        /*
        Brute Force: Four loops and find all pairs
        
        Better Approach: Using hashmap. FIX i and j and then store in between of k and l
        
        Optimal Solution: FIX i and j and then apply two pointers approach same as 3sum problem
        
        */

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int i, j, k, l, tmp;
        long sum;

        // System.out.println("Sorted Array");

        // for (Integer ii: nums) {
        //     System.out.print(ii + " ");
        // }
        // System.out.println();

        for (i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            for (j = i + 1; j < nums.length; j++) {
                if (j > i+1 && nums[j] == nums[j - 1])
                    continue;
                k = j + 1;
                l = nums.length - 1;
                while (k < l) {
                    sum = (long) nums[i] + nums[j];
                    sum += (long) nums[k];
                    sum += (long) nums[l];

                    // System.out.println(i + " " + j + " " + k + " " + l + " " + sum);
                    if (sum < target) {
                        tmp = nums[k];
                        while (k < l && nums[k] == tmp)
                            k++;
                    } else if (sum > target) {
                        tmp = nums[l];
                        while (k < l && nums[l] == tmp)
                            l--;
                    } else {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));

                        tmp = nums[k];
                        while (k < l && nums[k] == tmp)
                            k++;

                        tmp = nums[l];
                        while (k < l && nums[l] == tmp)
                            l--;
                    }

                }

            }
        }
        return ans;
    }
}
