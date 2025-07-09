class Solution {
  //https://leetcode.com/problems/generate-binary-strings-without-adjacent-zeros/description/

    public void generateString(int length, int n, String curr, List<String> ans) {
        if (length==n) {
            // base case
            ans.add(curr);
            return;
        }
        if (curr.isEmpty() || curr.charAt(curr.length() - 1) != '0') {
            generateString(length + 1, n, curr + "0", ans);
        }        
        generateString(length + 1, n, curr + "1", ans);
    }


    public List<String> validStrings(int n) {
        List<String> ans = new ArrayList<>();
        generateString(0, n, "", ans);
        return ans; 

    }
}
