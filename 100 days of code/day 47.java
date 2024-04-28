/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Solution {
    int remove_duplicate(int A[],int N){
        // code here
         int i =0;
        for (int j = 1; j <N ; j++) {
            if (A[i] != A[j]){
                i++;
                A[i] = A[j];
            }
        }
        return i+1;
    }
}

