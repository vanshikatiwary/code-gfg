/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Solution {
    int binarysearch(int arr[], int n, int k) {
        // code here
          int lower = 0;
        int higher = n-1;
        int search_key = k;
       
        while(lower<=higher){
            int mid =(lower+higher)/2;
            if(arr[mid]==search_key){
        
               //  break;
                return mid;
             
            }
            if(search_key>arr[mid]){
                lower =mid+1;
                
            }
            if(search_key<arr[mid]){
                higher =mid -1;
            }
        }
         return -1;
        
        
    }
} 