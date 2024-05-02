class Solution{
    
    int Maximize(int arr[], int n)
    {
        // Complete the function
        Arrays.sort(arr);
        
        // Initialize result
        long result = 0;

        // Calculate the maximum value
        for (int i = 0; i < n; i++) {
            result += (long)arr[i] * i;
            result %= 1000000007; // Take modulo to prevent overflow
        }
        
        return (int)result;
    }   
}


        