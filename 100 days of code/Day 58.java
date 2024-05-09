class Solution
{
    public String multiplyStrings(String s1,String s2)
    {
        //code here.
         String result = "";
        BigInteger a = new BigInteger(s1);
        BigInteger b = new BigInteger(s2);
        
        BigInteger mul = a.multiply(b);
        result += mul.toString();
        
        return result;
    }
       
}


   
