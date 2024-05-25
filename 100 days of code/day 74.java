class Solution {
    long max_Books(int arr[], int n, int k) {
        // Your code here
           long m=0;
        long a=0;
        int i=0;
        while(i<n)
        {
            if(arr[i]<=k)
            {
                a=0;
                while(i<n && arr[i]<=k)
                {
                    a+=arr[i];
                    i++;
                }
                m=Math.max(a,m);
            }
            
            else
            {
                i++;
            }
            
        }
        return m;
    }
}

