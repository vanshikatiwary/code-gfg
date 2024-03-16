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
      //  leftViewRecursive(root, 1, result);
         ArrayList<Integer> left = new ArrayList<>();
        leftNodes(root, 1, left);
        return left;
    }

    private static void leftNodes(Node root, int depth, ArrayList<Integer> left){
        if(root == null){
            return;
        }
        if(depth > left.size()){
            left.add(root.data);
        }
        leftNodes(root.left, depth +1, left);
        leftNodes(root.right, depth +1, left);
    }
 
    }
