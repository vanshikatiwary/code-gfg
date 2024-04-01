/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
          // Your code here
      ArrayList<Integer> left=new ArrayList<>();
      left(root,1,left);
      return left;
    }
    
    static void left(Node root,int lev,ArrayList<Integer> ans){
        if(root==null) return;
        if(lev>ans.size()) ans.add(root.data);
        left(root.left,lev+1,ans);
        left(root.right,lev+1,ans);
    }
}
   