class Solution
{
    public long PowMod(long x, long n, long m)
    {
        // Code here
         long ans=1;
        while(n>0){
            if(n%2==1){
                ans=(ans*x)%m;
                n--;
            }
            x=(x*x)%m;
            n=n/2;
            
        }
        return (int)(ans);
    }
}


 