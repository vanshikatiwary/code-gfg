/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Solution {
    public long count(int coins[], int N, int sum) {
        // code here.
          // Create an array to store the number of ways 
        long[] ways = new long[sum+1];
        // 0 coins can be formed in 1 way. so set it 1.
        ways[0] = 1;
        // First loop through each coin
        for (int i=0;i < N;i++){
            // Second loop through each ways.  Each way is calculated using the formula:
            // j-coins[i]+ways[j];
            for (int j=0; j<=sum; j++){
                
                if (coins[i] <= j){
                    ways[(int)j] += ways[(int)j - coins[i]];
                }
            }
        }
        // Return the value at sum position. 
        return ways[(int)sum];
    }
}
