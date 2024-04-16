/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Solution{
    static int nCr(int n, int r)
    {
        // code here
         if(n<r) return 0;
        if(r==n || r==0) return 1;
        int dp[] = new int[n+1];
        dp[0] = 1;
        int mod = 1000000007;
        for (int i=1; i<=n; i++) {
            for (int j = Math.min(i,r); j>0; j--) {
                dp[j] = (dp[j] + dp[j-1]) % mod;
            }
        }
        return dp[r];
    }
}      
