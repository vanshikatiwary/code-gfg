/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Solution
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    //Function to return length of longest subsequence of consecutive integers.
	static int findLongestConseqSubseq(int arr[], int N)
	{
	   // add your code here
	  Arrays.sort(arr);
       int largest=1;
       int count=0;
       int last= -1;
       for(int i=0; i<N; i++){
           if(arr[i]-1==last){
               count++;
               last=arr[i];
           }
           else if(arr[i]!=last){
               count=1;
               last=arr[i];
           }
           largest=Math.max(largest, count);
           
       }
       return largest;
    }
}