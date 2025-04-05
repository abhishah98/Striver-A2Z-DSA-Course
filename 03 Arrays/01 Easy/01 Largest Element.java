class Solution {
    public static int largest(int[] arr) {
        // code here
        int mx = arr[0];
        for (int i=1; i<arr.length; i++) {
            if (arr[i] > mx)
                mx = arr[i];
        }
        return mx;
    }
}
