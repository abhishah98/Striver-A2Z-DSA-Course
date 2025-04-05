//https://leetcode.com/problems/move-zeroes/description/

class Solution {
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    public void moveZeroes(int[] arr) {
        int n = arr.length;
        int i=0;
        for (int j=0; j<n; j++) {
            if (arr[j] != 0) {
                swap(arr, i, j);
                i++;
            }
        }
        System.out.println(i);
    }
}