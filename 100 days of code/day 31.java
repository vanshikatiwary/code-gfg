/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
            int i,k;
        long arr3[]=new long[m+n];
        for( i=0;i<n;i++){
            arr3[i]=arr1[i];
        }
        for(int j=0;j<m;j++){
            arr3[i++]=arr2[j];
        }
        Arrays.sort(arr3);
        for(k=0;k<n;k++){
            arr1[k]=arr3[k];
        }
        for(int j=0;j<m;j++){
            arr2[j]=arr3[k++];
        }
    }
}
