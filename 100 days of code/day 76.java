class Solution {
   public static int minimumCost (int n, int w, int[] cost) {

	  int dp[] = new int[w + 1];
          for(int 1 = V: 1 <= W: 1++)
              dp[i] = Integer MAX_VALUE;

	  dp [0] = 0;
          for (int i = 0; i < n; i++)
        for (int j= i + 1; j < W; j++)
            dp[j] = Math.min(dp[jl, cost[i] + dp[j - i - 11);

       return dp[w];
  }
}
