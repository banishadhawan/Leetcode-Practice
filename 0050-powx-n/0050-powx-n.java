class Solution {
    public double myPow(double x, int n) {
        return solve(x,(long)n);
    }
    private double solve(double x, double n){
        if(n==0) return 1.0;

        if(n<0) return 1.0/solve(x,-n);
        else if(n%2==0) return solve(x*x,n/2);
        else return x * solve(x*x,(n-1)/2);
    }
}
