/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        Arrays.sort(arr);
        int kthElement=0;
        for(int i=0;i<arr.length;i++){
            if(i==k-1){
                kthElement=arr[i];
            }
        
        }
        return kthElement;
    } 
}
