/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Solution {
     int minDist(int a[], int n, int x, int y) {
        int ans= Integer.MAX_VALUE;
        int idx1=-1;
        int idx2=-1;
        for(int i=0;i<n;i++){
            if(a[i]==x){
               idx1=i; 
            }
            if(a[i]==y){
                idx2=i;
            }
            if(idx1 !=-1 && idx2 !=-1){
                ans=Math.min(ans,Math.abs(idx2-idx1));
            }
        }
        if(idx1==-1 || idx2==-1){
            return -1;
        }
        return ans;
    }
}