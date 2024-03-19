/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        if(size == 1) return a[0];
        Arrays.sort(a);
        int count = 0;
        int j = a[0];
        for(int i=1;i<size;i++){
            if(a[i] == j){
                count++;
                if(count >= size/2) return a[i];
            }
            else{
                j = a[i];
                count = 0;
            }
        }
        return -1;
    }
} 
