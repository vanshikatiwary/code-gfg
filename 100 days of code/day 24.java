/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
         int count=0;
        int max=0;
        int index=-1;
        for(int i=0;i<n;i++){
            count=0;
            for(int j=0;j<m;j++){
                if(arr[i][j]==1)count++;
            }
           if(count>max){
               max=count;
                index=i;
           }
          
        }
        return index;
    }
}
   