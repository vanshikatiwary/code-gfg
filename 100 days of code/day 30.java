/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Solution{
    //Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        // add code here
         Node ptr=head;
        while(ptr.next!=null)
        {
            ptr=ptr.next;
        }
        while(k>0)
        {
            ptr.next=head;
            ptr=head;
            head=head.next;
            ptr.next=null;
            k--;
        }
        return head;
    }
}


   