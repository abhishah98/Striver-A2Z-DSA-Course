// https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1

class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        int i = 0, j = 0, n1 = a.length, n2 = b.length;
        
        while (i < n1 && j < n2) {
            if (a[i] < b[j]) {
                if (ans.isEmpty() || ans.get(ans.size() - 1) != a[i]) {
                    ans.add(a[i]);
                }
                i++;
            } 
            else if (b[j] < a[i]) {
                if (ans.isEmpty() || ans.get(ans.size() - 1) != b[j]) {
                    ans.add(b[j]);
                }
                j++;
            } 
            else { // a[i] == b[j]
                if (ans.isEmpty() || ans.get(ans.size() - 1) != a[i]) {
                    ans.add(a[i]);
                }
                i++;
                j++;
            }
        }

        // Process remaining elements of `a`
        while (i < n1) {
            if (ans.isEmpty() || ans.get(ans.size() - 1) != a[i]) {
                ans.add(a[i]);
            }
            i++;
        }

        // Process remaining elements of `b`
        while (j < n2) {
            if (ans.isEmpty() || ans.get(ans.size() - 1) != b[j]) {
                ans.add(b[j]);
            }
            j++;
        }

        return ans;
    }
}
