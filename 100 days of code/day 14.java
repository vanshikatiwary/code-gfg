/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int A[], int n, int X) { 
    
       // Your code Here
        Arrays.sort(A);
        int j;
        int k;
        for(int i=0;i<n;i++)
        {
            j=i+1;
            k=n-1;
            while(j<k)
            {
                if(A[i]+A[j]+A[k]==X)
                {
                    return true;
                }
                else if(A[i]+A[j]+A[k]>X)
                {
                    k--;
                }
                else if(A[i]+A[j]+A[k]<X)
                {
                    j++;
                
                }
            }
        }
        
        return false;
       
    
    }
}
