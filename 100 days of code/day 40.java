/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Solution{
     String longestCommonPrefix(String arr[], int n){
        
        if(n==1) return arr[0];
        
        String word1=arr[0];
        String res="";
        
        for(int i=1; i<n; i++){
            res = compareString(word1,arr[i]);
            word1 = res;
        }
        return res;
    }
    public String compareString(String str1, String str2){
        String res = "";
        int size = Math.min(str1.length(), str2.length());
        int i=0;
        while(i<size){
            if(str1.charAt(i)!=str2.charAt(i)) break;
            else res += str1.charAt(i);
            i++;
        }
        if(res=="") return "-1";
        return res;
    }
}