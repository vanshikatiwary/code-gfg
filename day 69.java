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
  