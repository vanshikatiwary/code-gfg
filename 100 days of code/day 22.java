/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Solution {
    //Function to find the height of a binary tree.
    int height(Node node) 
    {
        // code here 
         if(node == null)
       return 0;
       
       else{
           int ldepth = height(node.left);
           int rdepth = height(node.right);
           
           if(ldepth > rdepth){
               return(ldepth+1);
           }
           else
           {
               return (rdepth+1);
           }
       }
    }
}
   