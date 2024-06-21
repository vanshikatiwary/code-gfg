class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        Arrays.sort(arr,(a,b)->b.profit-a.profit);
        int md=0;
        for(int a=0 ;a<n;a++ ){
            md=Math.max(md,arr[a].deadline);
        }
        
        boolean []jb= new boolean[md+1];
     int id=0,p=0;
     for(int i=0;i<n;i++){
         for(int  j=arr[i].deadline;j>0;j--){
             
             
         if(jb[j]==false){
             jb[j]=true;
             id+=1;
             p+=arr[i].profit;
             break;
         }
     }
    }
    return  new int[]{id,p};
}
}