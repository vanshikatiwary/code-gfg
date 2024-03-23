/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
    public boolean findTriplets(int arr[] , int n)
    {
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int start = i+1;
            int end = n-1;
            
            while(start<end){
                if(arr[i]+arr[start]+arr[end]==0){
                    return true;
                }
                else if(arr[i]+arr[start]+arr[end]<0){
                    start++;
                }
                else{
                    end--;
                }
            }
        }
        return false;
    }
}