//{ Driver Code Starts
import java.util.*;
import java.io.*;

class GFG
 {
	public static void main (String[] args)
	 {
	  
	  //taking input using Scanner class
	  Scanner sc = new Scanner(System.in);
	  
	  //taking count of testcases
	  int t = sc.nextInt();
	  while(t-- > 0){
	      
	      //taking count of houses
	      int n = sc.nextInt();
	      int arr[] = new int[n];
	      
	      //inserting money present in 
	      //each house in the array
	      for(int i = 0; i<n; ++i)
	           arr[i] = sc.nextInt();
  	      
  	      //calling method FindMaxSum() of class solve
  	      System.out.println(new Solution().FindMaxSum(arr, n));
	 }
   }
}
// } Driver Code Ends


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

