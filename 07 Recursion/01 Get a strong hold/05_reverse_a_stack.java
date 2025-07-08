// User function Template for Java

class Solution {
    // https://www.geeksforgeeks.org/problems/reverse-a-stack/1
    public static void myReverse(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int element = s.pop();
        myReverse(s);
        insertAtBottom(s, element);
    }

    public static void insertAtBottom(Stack<Integer> s, int element) {
        if (s.isEmpty()) {
            s.push(element);
            return;
        }
        int top = s.pop();
        insertAtBottom(s, element);
        s.push(top);
    }
    
    static void reverse(Stack<Integer> s) {
        // add your code here
        myReverse(s);
    }
}
