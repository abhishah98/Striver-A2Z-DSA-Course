class Solution {
    public boolean check(int[] arr) {
        int n = arr.length, flip=0;

        for (int i=0; i<n-1; i++) {
            if (arr[i] > arr[i+1]) {
                flip++;
            }
        }
        if (arr[n-1] > arr[0]) flip++;
        return flip<=1;
    }
}