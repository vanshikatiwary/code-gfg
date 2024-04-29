/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Solution{
    static int isPrime(int N){
        // code here
          if(N==1){
            return 0;
        }
        int n=(int)Math.sqrt(N);
        for(int i=2;i<=n;i++){
            if(N%i==0){
                return 0;
            }
        }
        return 1;
    }
}
   