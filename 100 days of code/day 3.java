/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {
     int leftSum=0;
        int sum=0;
        for(int i=0;i<n;i++) {
            sum +=arr[i];
        }
        
        for(int i=0;i<n;i++) {
            sum-=arr[i];
            if(sum == leftSum) {
                return i+1;
                
            }
            leftSum += arr[i];
        }
        return -1;
    }
}