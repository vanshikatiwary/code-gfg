//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
     String longestCommonPrefix(String arr[], int n){
        
        if(n==1) return arr[0];
        
        String word1=arr[0];
        String res="";
        
        for(int i=1; i<n; i++){
            res = compareString(word1,arr[i]);
            word1 = res;
        }
        return res;
    }
    public String compareString(String str1, String str2){
        String res = "";
        int size = Math.min(str1.length(), str2.length());
        int i=0;
        while(i<size){
            if(str1.charAt(i)!=str2.charAt(i)) break;
            else res += str1.charAt(i);
            i++;
        }
        if(res=="") return "-1";
        return res;
    }
}