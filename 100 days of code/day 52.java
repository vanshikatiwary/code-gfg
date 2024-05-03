class Solution
{
    public int check(int[] arr,int i,int n,int[] dp){
        if(i >= n){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int take = check(arr,i+2,n,dp)+arr[i];
        int noTake = check(arr,i+1,n,dp);
        
        dp[i] = Math.max(take,noTake);
        return dp[i];
    }
    public int FindMaxSum(int arr[], int n)
    {
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return check(arr,0,n,dp);
    }
}

