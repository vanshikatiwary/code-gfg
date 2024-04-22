/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        // code here
           int [] freq=new int[N+P];
        int n=arr.length;
        for(int i=0;i<n;i++)
            freq[arr[i]]+=1;
        for(int i=0;i<n;i++)
         arr[i]=freq[i+1];     // 1st element in freq array contains 0th frequnecy so start from 2nd element
    }
}