class Solution {

    int maxIndexDiff(int arr[], int n) {
        // code here
       int rightMax[] = new int[n];
        rightMax[n-1] = arr[n-1];
        
        for(int i = n-2; i>=0; i--){
            rightMax[i] = Math.max(arr[i], rightMax[i+1]);
        }
        int ans = 0;
        int i = 0, j = 0;
        while(i<n && j<n){
            if(arr[i]<=rightMax[j]){
                ans = Math.max(ans, j-i);
                j++;
            }
            else i++;
        }
        return ans;
    }
}
