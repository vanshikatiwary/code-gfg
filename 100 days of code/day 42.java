/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Solution {
    int transitionPoint(int arr[], int n) {
        // code here
           int start=0;
        int end=n-1;
        int mid;


        while(start<=end){
            mid=(start+end)/2;
            if(arr[mid]==1 && (mid==0 || arr[mid-1]==0)) return mid;
            else if(arr[mid]==0) start=mid+1;
            else end=mid-1;
        }


        return -1;
    }
}