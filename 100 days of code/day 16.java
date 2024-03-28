/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        int start = 0;
        int end = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        int sum = 0;

        while (end < n) {
            sum = sum + arr[end];

            while (sum > s && start <= end) {
                sum = sum - arr[start];
                start++;
            }

            if (sum == s && start <= end) {
                ans.add(start + 1);
                ans.add(end + 1);
                return ans;
            }

            end++;
        }

        ans.add(-1);
        return ans;
    }
}