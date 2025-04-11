// Problem: https://leetcode.com/problems/sort-colors/

class Solution {
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public void sortColors(int[] arr) {
        // Optimal Approch
        // Keep three pointers lo, mid, hi
        int lo = 0, mid = 0, hi = arr.length - 1;

        while (mid <= hi) {
            if (arr[mid] == 0) {
                swap(arr, lo, mid);
                lo++;
                mid++;
                // System.out.println("0: " + lo + " " + mid + " " + hi);
            } else if (arr[mid] == 1) {
                mid++;
                // System.out.println("1: " + lo + " " + mid + " " + hi);                
            } else if (arr[mid] == 2) {
                swap(arr, hi, mid);
                hi--;
                // System.out.println("2: " + lo + " " + mid + " " + hi);
            }

        }

    }
}

