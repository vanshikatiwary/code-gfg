/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Compute {
    
    public void rotate(int arr[], int n)
    {
          int last = arr[n-1];
        
        for(int i=n-1; i>0; i--){
            arr[i]=arr[i-1];
            
        }
        arr[0]=last;
    }
}
   