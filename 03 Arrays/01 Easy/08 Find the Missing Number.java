// https://leetcode.com/problems/missing-number/

class Solution {
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    public int missingNumber(int[] arr) {


        /*
            Approach 1: Brute Force
            - Find each element is present or not.... O(N^2)
            Approach 2: Summation (Not prefrable for large number)
            - Sum of N natural number - Sum of array
            Approach 3: XOR Approach (Best approach)
            - XOR approach (XOR everything with the XOR of [1,N] approach)
        */

        int xor1=0, xor2=0, n=arr.length;
        for (int i=0; i<n; i++) {
            xor1 = xor1 ^ (i+1);
            xor2 = xor2 ^ arr[i];
        }
        // xor1 = xor1 ^ (n);
        return xor1^ xor2;

    }
}
