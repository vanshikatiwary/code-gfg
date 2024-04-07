/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here
         Arrays.sort(arr);
        int start=0,end=n-1;
        while(start<end){
            if(arr[start]+arr[end]==x){
                return true;
            }
            else if(arr[start]+arr[end]<x){
                start++;
            }
            else{
                end--;
            }
        }
        return false;
    }
}

