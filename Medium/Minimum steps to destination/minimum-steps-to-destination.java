//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            int d = Integer.parseInt(in.readLine());

            Solution ob = new Solution();
            System.out.println(ob.minSteps(d));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int minSteps(int d) {
        // code here
         d = Math.abs(d); // Make destination positive for easier calculations
        int steps = 0;
        int sum = 0;

        while (sum < d || (sum - d) % 2 != 0) {
            steps++;
            sum += steps;
        }

        return steps;
    }

    public static void main(String[] args) {
        int destination = 10;
        int minStepsRequired = minSteps(destination);
        System.out.println("Minimum steps required to reach destination " + destination + ": " + minStepsRequired);
    }
}