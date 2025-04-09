class Solution {
    public List<List<Integer>> threeSum(int[] nums) {


        /*
        // BRUTE FORCE APPROACH        
        Set<List<Integer>> ans = new HashSet<List<Integer>>();

        for (int i=0; i<nums.length; i++) {
            for (int j=0; j<nums.length; j++) {
                for (int k=0; k<nums.length; k++) {
                    if (i==j || i==k || j==k) {
                        continue;
                    }
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        int[] arr = new int[]{nums[i], nums[j], nums[k]};
                        Arrays.sort(arr);
                        ans.add(Arrays.asList(arr[0], arr[1], arr[2]));
                    }
                }
            }
        }
        return new ArrayList<>(ans);
        */

// ----------------------------------------------------------------------------------------------------
        // Better solution with Hashmap
        // Fix one element and look for other sum in the array just like two sum. arr[i] = -(arr[j] + arr[k])
        /*
        Set<List<Integer>> ans = new HashSet<List<Integer>>();
        Map<Integer, Boolean> mp = new HashMap<Integer, Boolean>();

        for (int i =0; i<nums.length; i++) {     
            mp.clear();
            for (int j=i+1; j<nums.length; j++) {
                int sum = (nums[i] + nums[j])*-1;
                if (mp.containsKey(sum)) {
                    int[] temp = new int[]{nums[i], nums[j], sum};
                    Arrays.sort(temp);
                    ans.add(Arrays.asList(temp[0], temp[1], temp[2]));
                }
                mp.put(nums[j], true);
            }
        }
        return new ArrayList<>(ans);
    }

 // --------------------------------------------------------------------------------------------------
        Optimal Solution: Use two pointers on the sorted array.
        Fix the first element and then apply the two pointers approach on the second element. 
        this way we dont have to store the tripletes in hashmap.
   */

        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        int i, j, k, tmp, sum;
        for (i=0; i<nums.length; i++) {
            // to avoid same nums[i]s
            if (i>0 && nums[i] == nums[i-1]) continue;
            j=i+1;
            k=nums.length-1;
            while (j<k) {
                sum = nums[i] + nums[j] + nums[k];
                // System.out.print (i + " " + j + " " + k + " : " + nums[i] + " " + nums[j] + " " + nums[k]);
                if (sum < 0) {
                    // for (Integer ii: nums) System.out.println(ii);
                    tmp = nums[j];
                    while (j<k && nums[j] == tmp) j++;
                    // System.out.println("First if : " + j + " " +  nums[j]);
                }
                else if (sum > 0) {
                    tmp = nums[k];
                    while (j<k && nums[k] == tmp) k--;
                    // System.out.println("Second if : " + k + " " +  nums[k]);

                }
                else {
                    // ans
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));                  
                    tmp = nums[j];
                    while (j<k && nums[j] == tmp) j++;
                    tmp = nums[k];
                    while (j<k && nums[k] == tmp) k--;
                }
            }

        
        }

        return ans;
    }
}
