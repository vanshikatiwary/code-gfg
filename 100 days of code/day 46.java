/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Compute {
    
    public int largest(int arr[], int n)
    {
         int largest = arr[0];
        for(int i=0;i<arr.length;i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }
}
   