/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Solution {
    int missingNumber(int array[], int n) {
        int sum = (n*(n+1))/2;
        int arrSum = 0;
        for(int i=0; i<array.length;i++){
            arrSum = arrSum + array[i];
        }
        int ans = sum - arrSum;
        return ans;
    }
}