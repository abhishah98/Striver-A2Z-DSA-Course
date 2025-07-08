/*Complete the function below*/
class GfG {
    //https://www.geeksforgeeks.org/problems/sort-a-stack/1
    public static void myInsert (Stack<Integer> s, int element) {
        if (s.isEmpty() || s.peek() <= element) {
            s.push(element);
            return;
        }
        int top = s.pop();
        myInsert(s, element); // check again for s.peek() <= element
        s.push(top);
    }
    
    public Stack<Integer> mySort(Stack<Integer> s) {
        if (s.isEmpty() || s.size() ==1) {
            // bsase case
            return s;
        }
        int top = s.pop();
        mySort(s);
        myInsert(s, top);
        return s;
    }

    public Stack<Integer> sort(Stack<Integer> s) {
        return mySort(s);
    }
}
