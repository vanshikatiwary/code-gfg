/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Solution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr, int n) {
        // Your code here
         int ans=Integer.MIN_VALUE;;
         for(int i=0;i<n;i++){
             ans=Math.max(ans,arr[i]);
         }
         int[] a=new int[ans+1];
         for(int i=0;i<n;i++){
             a[arr[i]]++;
         } 
         for(int i=0;i<n;i++){
             if(a[arr[i]]>1){
                 return i+1;
             }
         }
         return -1;
    }
}