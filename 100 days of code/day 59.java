class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        List<Integer> list1 = new ArrayList<>();
        for (int num : arr1) {
            list1.add(num);
        }
        List<Integer> list2 = new ArrayList<>();
        for (int num : arr2) {
            list2.add(num);
        }
        
        list1.addAll(list2);
        Collections.sort(list1);
        return list1.get(k-1);
    }
} 
        
  