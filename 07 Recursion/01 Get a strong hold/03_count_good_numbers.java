class Solution {
  // LEETCODE: https://leetcode.com/problems/count-good-numbers/
    public long MOD = 1000000007;
    public long mypower(long x, long n) {
        if (n==0) return 1;
        long half = mypower(x, n/2);
        if (n%2==0) return (half*half)%MOD;
        else return (((half*half)%MOD)*x)%MOD;
    }
    public int countGoodNumbers(long n) {
        // bruteforce solution
        // Even: total 5: 02468
        // ODD: prime 4: 2357

        // int ans = 1;
        // for (int i=0; i<n; i++) {
        //     if (i%2==0) {
        //         // even
        //         ans = (int) ((ans * 5L)%MOD);
        //     }
        //     else {
        //         // odd
        //         ans = (int) ((ans * 4L)%MOD);
        //     }
        // }
        // return ans;


        // Optimal Approach
        // count total number of even and odd places
        long odd = n/2, even = n-odd;
        return (int)(((mypower(5, even)%MOD)*(mypower(4, odd)%MOD))%MOD);
    }
}
