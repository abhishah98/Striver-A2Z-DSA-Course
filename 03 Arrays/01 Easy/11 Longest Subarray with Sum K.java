
class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        
        // 1. Hashmap Solutino
        // HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        
        // mp.put(KEY, VALUE);
        // mp.get(KEY);
        // mp.containsKey(KEY);
        // mp.containsValue(VALUE);
        // mp.replace(KEY, VALUE);
        
        // int ans = 0, curr = 0, n=arr.length;
        
        // for (int i=0; i<n; i++) {
        //     curr += arr[i];
        //     if (curr==k) {
        //         ans = Math.max(ans, i+1);
        //     }
        //     if (!mp.containsKey(curr)){
        //         mp.put(curr, i);
        //     }
        //     if (mp.containsKey(curr-k)) {
        //         ans = Math.max(ans, i- mp.get(curr-k));
        //     }
        // }
        
        // 2. Two Pointers Solution
        int ans=0, left=0, right=0, n=arr.length, curr=0;
        
        while (right<n) {
            curr += arr[right]; 
            
            // Shrink the window till the sum > k
            while (curr > k && left <= right) {
                curr -= arr[left];
                left++;
            }
            
            // Check if sum matches
            if (curr == k) {
                ans = Math.max(ans, right-left+1);
                System.out.println(left + " " + right);
            }
            
            // move the right
            right++;
        }
    
        return ans;
    }
}
