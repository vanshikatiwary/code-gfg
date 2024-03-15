/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Solution {
    int print2largest(int arr[], int n) {
        // code here
        Arrays.sort(arr);
    for(int i=n-1;i>=0;i--){
       int k=arr[n-1];
        if(arr[i]!=k){
            return arr[i];
            // break;
        }
    }
     return -1;
    }
}
    