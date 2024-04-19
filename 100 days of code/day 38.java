/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Solution {
    public List<String> find_permutation(String S) {
        // Code here
          int n=S.length(); 
        char c[]=S.toCharArray();  
        List<String> A=new ArrayList<>(); 
        fun(0,n,c,A);

        Collections.sort(A); 
        return A;
    }

    public void fun(int idx,int n,char c[], List<String> ans) {
        if(idx>=n){
            String str = new String(c);
            if(!ans.contains(str))
                ans.add(str);
            return;
        }
        
        for(int i = idx;i<n;i++){
            char t = c[i];
            c[i] = c[idx];
            c[idx] = t;
            fun(idx+1,n,c,ans);
            t = c[i];
            c[i] = c[idx];
            c[idx] = t;
        }
    }
}

