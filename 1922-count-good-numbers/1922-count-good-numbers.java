class Solution {
   long MOD = 1000000007;

    public int countGoodNumbers(long n) {
        long even = (n+1)/2;
        long odd = n/2;

        long ans = (pow(5,even) * pow(4,odd)) % MOD;
        return (int) ans;
    }

    private long pow(long base, long power){
        long res=1;

        while(power>0){
            if(power%2==1){
                res = (res*base) % MOD;
            }

            base  = (base*base) % MOD;
            power /=2;
        }
        return res;
    }
}
   