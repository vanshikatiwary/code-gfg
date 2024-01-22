//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPalindrome(String S) {
        // code here
         if(S == null || S.length() ==0){
            return 1;
        }
for(int i=0 ; i < S.length() / 2 ;i++ ){
            char s = S.charAt(i);
            char e = S.charAt(S.length()-1 -i);
            if(s != e){
                return 0;
            }
        }
        return 1;
        
 
    }
};