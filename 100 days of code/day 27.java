/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Solution{
    
   
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int A[], int N, int K) {
        //Complete the function
        Map<Integer,Integer> map = new HashMap<>();
        
        int sum =0;
        int len = 0;
        for(int i=0;i<N;i++)
        {
            sum+=A[i];
            if(sum == K)
            len = Math.max(len,i+1);
            if(map.containsKey(sum-K))
            len = Math.max(len,i-map.get(sum-K));
            if(!map.containsKey(sum))
            map.put(sum,i);
        }
        return len;
    }
}
   