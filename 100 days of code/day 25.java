/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Intersect
{
    //Function to find intersection point in Y shaped Linked Lists.
	int intersectPoint(Node head1, Node head2)
	{
         // code here
           if(head1==null && head2==null )return -1;
         
         Node s=head1;
         Node f= head2;
         
         while(s!=f){
             if(s==null)s=head2;
             else s=s.next;
             if(f==null)f=head1;
             else f=f.next;
             if(s==null && f==null)return -1;
         }
         return s.data;
}
}