/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Solution{
    static int minJumps(int[] arr){
        // your code here
        int jumpCount=0,maxReachable=0,current=0;

        for(int i=0;i<arr.length;i++){
            maxReachable = Math.max(maxReachable, i+arr[i]);
            if(current==i){
                if(i!=arr.length-1)
                    jumpCount++;
                current = maxReachable;
            }
        }
        if(current < arr.length-1)
            return -1;
        return jumpCount;
    }
}
   