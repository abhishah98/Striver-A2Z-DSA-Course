// https://leetcode.com/problems/max-consecutive-ones/

class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int mx = Integer.MIN_VALUE, n=arr.length, cnt=0;
        for (int i=0; i<n; i++) {
            if (arr[i] == 1) {
                // System.out.println(i + " " + cnt);
                cnt++;
            }
            else {
                if (cnt>mx) mx = cnt;
                cnt=0;
            }
        }
        return (cnt>mx)?cnt:mx;

    }
}
