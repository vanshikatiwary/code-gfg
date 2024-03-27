/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        // Add code here
         Node slow=head;
        Node fast=head;
        
        
        while((fast!=null) && (fast.next!=null)){
            slow=slow.next;
            fast=fast.next.next;
            
            if(fast==slow){
                return true;
            }
            
        }
        
        
        return false;
    }
}

  