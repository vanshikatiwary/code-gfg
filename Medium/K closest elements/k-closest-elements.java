//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().trim().split(" ");
            int k = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);

            int[] ans = new Solution().printKClosest(arr, n, k, x);
            for (int xx : ans) {
                System.out.print(xx + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int[] printKClosest(int[] arr, int n, int k, int x) {
        // code here
         int left=0, right=n;
        while (left < right) {
            int mid = left + (right - left)/2;
            if (x <= arr[mid])
                right = mid;
            else
                left = mid+1;
        }
        int[] result = new int[k];
        int i=left-1, j= (left < n && arr[left] != x) ? left : left+1;
        for (int a=0;a<k;a++) {
            if (i >= 0 && j < n) {
                result[a] = (arr[j]-x <= x-arr[i]) ? arr[j++] : arr[i--];
            }
            else if (i >= 0) {
                result[a] = arr[i--];
            }
            else {
                result[a] = arr[j++];
            }
        }
        return result;
    }
}
  