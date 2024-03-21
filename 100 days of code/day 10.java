/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
            Arrays.sort(arr);
        int missing=1;

        for(int i=0;i<size;i++){
            if(arr[i]<1)
            continue;
            else if
            (arr[i]==missing){
                missing++;}}

           return missing;
}
}