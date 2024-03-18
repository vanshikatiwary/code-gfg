/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
          int count_zeroes = 0;
        int count_ones = 0;
        int count_twos = 0;
        int counter = 0;
        
        for (int i=0; i<n; i++){
            if(a[i]==0){
                count_zeroes++;
            }
            if(a[i]==1){
                count_ones++;
            }
            if(a[i]==2){
                count_twos++;
            }
        }
        
        for (int i=0; i<count_zeroes; i++){
            a[counter++] = 0;
        }
        for (int i=0; i<count_ones; i++){
            a[counter++] = 1;
        }
        for (int i=0; i<count_twos; i++){
            a[counter++] = 2;
        }
    }
}