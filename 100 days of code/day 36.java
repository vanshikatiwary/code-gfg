/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Tree
{
         int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh)+1;
    }
    boolean isBalanced(Node root){
      if(root == null){
          return true;
      }
      if(Math.abs(height(root.left)-height(root.right)) > 1){
          return false;
      }
      return isBalanced(root.left) && isBalanced(root.right);
    }
}
