/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Solution{
    
    // temp: input array
    // n: size of array
    //Function to rearrange  the array elements alternately.
    public static void rearrange(long arr[], int n){
        
        // Your code here
          long ari[]=new long[n];
        for(int i = 0;i<n;i++){
            ari[i]=arr[i];
            
            
        }
        Arrays.sort(ari);
int startingindex = 0;
int endingindex = n-1;
for(int i =0;i<n;i++){
arr[i]= ari[endingindex];
endingindex--;
i++;
}
for(int i =1;i<n;i++){
    arr[i]= ari[startingindex];
    startingindex++;
    i++;
    }
}
}

