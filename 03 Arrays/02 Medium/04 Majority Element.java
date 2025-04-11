// Leetcode Problem: https://leetcode.com/problems/majority-element/

class Solution {
    public int majorityElement(int[] nums) {
        // Moor's Voting Algorith to be used
        // Assume first element to be the answer and then increase count for that element and decrease for others
        // once count becomes zero, reset the voiting element.
        int element=nums[0], cnt=0;
        for (int i=0; i<nums.length; i++) {
            if (cnt == 0) element = nums[i];
            if (nums[i] == element) cnt++;
            else cnt--;            
        }

        return element;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)
// Note: This algorithm works because the majority element appears more than n/2 times, so it will always be the last element standing in the voting process.