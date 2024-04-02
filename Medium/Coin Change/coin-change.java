//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int sum = sc.nextInt();
            int N = sc.nextInt();
            int coins[] = new int[N];
            for (int i = 0; i < N; i++) coins[i] = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.count(coins, N, sum));
        }
    }
}


// } Driver Code Ends


// User function Template for Java

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


        