class Solution {
    
    public int findMinCost(String x, String y, int costX, int costY) {
        
         int a = x.length();
         int b = y.length();
        
        int arr[] = new int[b+1], prev[] = new int[b+1];
        
        for(int i=1; i<=a; i++){
            for(int j=1; j<=b; j++){
                
                if(x.charAt(i-1) == y.charAt(j-1))
                    {
                        
                    arr[j] = prev[j-1] + 1;
                }else
                {
                    
                    arr[j] = Math.max( arr[j-1], prev[j] );
                }
            }
            
            prev = arr;
            arr = new int[b+1];
        }
        
        int ans = prev[b];
        
        int p = a-ans;
        int q = b-ans;
        
        return p*costX + q*costY;
    }
}
