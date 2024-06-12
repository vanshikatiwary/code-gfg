class Solution {
    public static int countNumberswith4(int n) {
        // code here
             int i=1;
        int count=0;
        while(i<=n){
            String temp=String.valueOf(i);
            StringBuilder s=new StringBuilder(temp);
            if(s.indexOf("4")!=-1){
                count++;
            }
            i++;
        }
        return count;
    }
    }

