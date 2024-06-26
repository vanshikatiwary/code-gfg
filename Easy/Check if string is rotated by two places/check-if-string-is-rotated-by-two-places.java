//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		String s12 = sc.nextLine();
		for(int i=0; i<t; i++){
		    String s1 = sc.nextLine();
		    String s2 = sc.nextLine();
		    
		    Solution obj = new Solution();
		    
		    boolean flag = obj.isRotated(s1, s2);
		    
		    if(flag == true) System.out.println("1");
		    else System.out.println("0");
		    
		}
	}
}
// } Driver Code Ends


class Solution
{
    
    public static boolean isRotated(String str1, String str2)
    {

        if(str1.length()==1||str2.length()==1)
            return false;
        
        int n=str1.length();
        
        String s1=  str1.substring(2,n)  +  str1.substring(0,2)  ;
        
        String s2=  str1.substring(n-2,n) +  str1.substring(0,n-2) ;
        
        return s1.equals(str2)||s2.equals(str2);
    }
    
}