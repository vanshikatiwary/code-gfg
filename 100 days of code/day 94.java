class Solution {
    public static ArrayList<Integer> getPrimes(int n) {
        // code here
        ArrayList<Integer> arr=new ArrayList<>();
        boolean [] isPrime=new boolean[n/2];
        Arrays.fill(isPrime,false);
        for(int i=3;i*i<n;i+=2){
            if(!isPrime[i/2]){
                for(int j=i*i;j<n;j+=i*2){
                    isPrime[j/2]=true;
                }
            }
        }
        arr.add(2);
        for(int i=3;i<n;i+=2){
            if(!isPrime[i/2]){
                arr.add(i);
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0,j=arr.size()-1;
        while(i<=j){
            int sum=arr.get(i)+arr.get(j);
            if(sum==n){
                ans.add(arr.get(i));
                ans.add(arr.get(j));
                break;
            }else if(sum<n){
                i++;
            }else{
                j--;
            }
        }
        if(ans.size()==0){
            ans.add(-1);
             ans.add(-1);
        }
        return ans;
    }
}