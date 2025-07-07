class Main{

    // Recursive function to compute atoi()
    public static int myAtoi(String str, int n) {
        // Base case 
        if (n == 1)    {
            return str.charAt(0) - '0';
        }
        return (10 * myAtoi(str, n - 1) + 
                          str.charAt(n - 1) - '0');
    }
    
    public static void main(String[] args) {
        String str = "112";
        int n = str.length();
        
        // precheck if its a valid String
        if (str.equals("") || !str.matches("^\\d*$")) {
            System.out.println("String is not valid");
        } else {
            System.out.println(myAtoi(str, n));
        }
    }
}
