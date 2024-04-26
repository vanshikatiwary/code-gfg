/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
         // Your code here
            if (head == null) {
            return null; // Handle the case of an empty list
        }

        HashSet<Integer> set = new HashSet<>();
        Node current = head;
        Node prev = null;

        while (current != null) {
            if (set.contains(current.data)) {
                // Duplicate found, remove current node
                prev.next = current.next;
            } else {
                // Unique element, add it to the set
                set.add(current.data);
                prev = current;
            }
            current = current.next;
        }

        return head;
    }
}
   