class Solution {
    public static long maxTip(int n, int x, int y, int[] arr, int[] brr) {
        // code here
         if(n==1){
            if(arr[0]>brr[0])return (long)arr[0];
            return (long)brr[0];
        }
        
        int D[][] = new int[n][2];
        
        for(int i=0;i<n;i++){
            D[i][0] = Math.abs(arr[i]-brr[i]);
            D[i][1] = i;
        }
        Arrays.sort(D,Comparator.comparingDouble(o->(o[0]))); 
        
        long ans = 0l;
        for(int i=n-1;i>=0;i--){
            
            int idx  = D[i][1];
            
            if(x==0){
                ans+=(long)brr[idx];
            }
            else if(y==0){
                ans+=(long)arr[idx];
            }
            
            else if(arr[idx]>=brr[idx]){
                 ans+=(long)arr[idx];
                 x--;
            }
            else if(arr[idx]<brr[idx]){
                 ans+=(long)brr[idx];
                 y--;
            }
        }
        return ans;
    }
    }

