// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
class Solution {
    public static void swap (int[] arr, int i, int j ) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int removeDuplicates(int[] arr) {
       int i = 0, curr = arr[i]; // curr element

       for (int j=1; j<arr.length; j++) {
        while (j<arr.length && arr[j] == curr ) {
            j++;
        }
        if (j<arr.length) {
            curr= arr[j];
            i++;
            swap(arr, i, j);
        }
       }
       return i+1;
    }
}
