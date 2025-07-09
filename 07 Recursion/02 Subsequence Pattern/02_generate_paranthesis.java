class Solution {
  // https://leetcode.com/problems/generate-parentheses/description/
  
    public boolean isValid(String str) {
        Stack<Character> st = new Stack<>();
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == '(') st.push(str.charAt(i));
            if (str.charAt(i) == ')') {
                if (st.isEmpty()) return false;
                st.pop();
            }
        }
        return st.isEmpty();
    }

    public void helper(int n, String curr, List<String> ans) {
        if (curr.length() == n) {
            // base case
            if (isValid(curr)){
                ans.add(curr);
            }
            return;
        }
        helper(n, curr + "(", ans);
        helper(n, curr + ")", ans);
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(n*2, "", ans);
        return ans;
    }
}
