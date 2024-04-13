/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Solution {
    
    public void dfsHelper(int node,boolean visited[],ArrayList<ArrayList<Integer>> adj,ArrayList<Integer>ans)
    {
        visited[node]=true;
        ans.add(node);
        for(int x:adj.get(node))
        {
            if(visited[x]==false)
            {
                dfsHelper(x,visited,adj,ans);
            }
        }
        
    }
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer>ans=new ArrayList<Integer>();
       boolean visited[]=new boolean[V];
       dfsHelper(0,visited,adj,ans);
       return ans;
    }
}
