class Solution {
    public int findPeakElement(List<Integer> a) {
            int x = -1;
        for(int i = 0;i < a.size() - 1; i++){
            if(a.get(i) > a.get(i+1)){
                x = a.get(i);
                break;
            }
            else if(a.get(i) <= a.get(i+1)){
                x = a.get(i+1);
                
            }
        }
        return x;
    }
}