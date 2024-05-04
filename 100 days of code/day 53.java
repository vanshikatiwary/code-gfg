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