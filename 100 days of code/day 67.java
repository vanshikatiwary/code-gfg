class Solution {
    public static int findClosest(int n, int k, int[] arr) {
        // code here
         int min = Integer.MAX_VALUE;
        int v = 0;
        for(int i=0; i<n; i++){
            int a = Math.abs(arr[i] - k);
            if(a <= min){
                min = a;
                if(arr[i] > v){
                    v = arr[i];
                }
            }
        }
        return v;
    }
}
  