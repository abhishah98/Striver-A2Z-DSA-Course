import java.util.*;
class Main {
    public static void helper(int[] arr, List<Integer> curr, int currSum, int k, int idx) {
        if (idx == arr.length) {
            if (currSum == k) {
                // printsubsequence
                for (Integer i: curr) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
            return;
        }
        // Include
        curr.add(arr[idx]);
        helper(arr, curr, currSum + arr[idx], k, idx + 1);

        // Exclude
        curr.remove(curr.size() - 1);
        helper(arr, curr, currSum, k, idx + 1);
    
    }    
    public static void printAllSubSequenceWithSumK(int[] arr, int k) {
        helper(arr, new ArrayList<>(), 0, k, 0);
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int k = 3;
        printAllSubSequenceWithSumK(arr, k);
    }
}
