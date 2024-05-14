//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
        	int[] array = new int[n];
        	for (int i=0; i<n ; i++ ) {
        		array[i] = sc.nextInt();
        	}
            Solution ob = new Solution();
            long[] ans = new long[n];
            ans = ob.productExceptSelf(array, n); 

           	for (int i = 0; i < n; i++) { 
				System.out.print(ans[i]+" ");
			} 
            System.out.println();
            t--;
        }
    } 
} 
  


// } Driver Code Ends


//User function Template for Java


class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
     int zeroCount=0;
        long product = 1;
        long [] result = new long[n];
        
        //Count 0s and find product
        for(int i=0; i<n; i++)
        {
            if(nums[i]==0)
            {
                zeroCount++;
                continue;
            }
            product= product * nums[i];
        }
        
        //No zeros in array
        if(zeroCount==0)
            for(int i=0; i<n; i++)
                result[i]=product/nums[i];
          
        //1 zero in array        
        else if(zeroCount==1)
            for(int i=0; i<n; i++)
                if(nums[i]==0)
                result[i]= product;
                
        //>1 zero in array then all the element in result should be 0 -> default
        
        return result;
    } 
} 