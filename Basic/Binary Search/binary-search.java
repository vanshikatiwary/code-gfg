//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

  public class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int key = sc.nextInt();
            Solution g = new Solution();
            System.out.println(g.binarysearch(arr, n, key));
            T--;
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int binarysearch(int arr[], int n, int k) {
        // code here
          int lower = 0;
        int higher = n-1;
        int search_key = k;
       
        while(lower<=higher){
            int mid =(lower+higher)/2;
            if(arr[mid]==search_key){
        
               //  break;
                return mid;
             
            }
            if(search_key>arr[mid]){
                lower =mid+1;
                
            }
            if(search_key<arr[mid]){
                higher =mid -1;
            }
        }
         return -1;
        
        
    }
} 