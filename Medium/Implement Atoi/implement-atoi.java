//{ Driver Code Starts
//Initial template for JAVA

import java.util.Scanner;

class aToi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			
			Solution obj = new Solution();
			int num = obj.atoi(str);
			
			System.out.println(num);
		t--;
		}
	}
}
// } Driver Code Ends


//User function template for JAVA

/*You are required to complete this method */
class Solution
{
    int atoi(String s) {
	// Your code here
 int idx = 0;
        if(s.charAt(0) == '-'){
           idx = 1;
        }
        int num = 0;
        for( int i = idx; i<s.length(); i++){
            if(s.charAt(i)-0 >= 48 && s.charAt(i)-0 <= 57 ){
                num = num*10 + (s.charAt(i)-48);
                
            }else{
               num = -1;
                break;
            }
            
            
        }
        
        if( idx == 1 && num != -1){
             return -1*num;
        }
        return num;
        

    }
}