class Solution {
    public double helper(double x, int n) {
        long N = n;
        if (n==0) return 1.0;

        double half = helper(x, n/2);

        if (n%2==0) {
            return half*half;
        }
        else {
            return half*half*x;
        }
    }

    public double myPow(double x, int N) {
        long n = N;
        if (n<0) {
             x = 1/x;  // x^(-n) = (1/x)^n
             n = n*-1;
        }
        return helper(x, (int)n);
    }
}
