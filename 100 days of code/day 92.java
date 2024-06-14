class Solution {
    static String armstrongNumber(int n) {
        // code here
     int total=0;
        int value=n;
        while(n>0){
            int digit = n%10;
            total += Math.pow(digit,3);
            n = n/10;
        }
        if(total==value)
            return "true";
        else
            return "false";
    }
};