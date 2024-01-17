//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
     public static ArrayList<Integer> duplicates(int arr[], int n) {
       HashMap<Integer, Integer> map = new HashMap<>();
       for(int i: arr){
           if(map.containsKey(i)){
              map.replace(i,map.get(i)+1);
           }else{
               map.put(i,1);
           }
       }
       ArrayList<Integer> list = new ArrayList<Integer>();
       for(Map.Entry<Integer, Integer> val: map.entrySet()){
           if(val.getValue()!=1){
               list.add(val.getKey());
           }
       }
       if(list.isEmpty()){
           list.add(-1);
           return list;
       }
       Collections.sort(list);
       return list;
    }
}
