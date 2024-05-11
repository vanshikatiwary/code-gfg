class Solution {
    static int minSteps(int d) {
        // code here
         d = Math.abs(d); // Make destination positive for easier calculations
        int steps = 0;
        int sum = 0;

        while (sum < d || (sum - d) % 2 != 0) {
            steps++;
            sum += steps;
        }

        return steps;
    }

    public static void main(String[] args) {
        int destination = 10;
        int minStepsRequired = minSteps(destination);
        System.out.println("Minimum steps required to reach destination " + destination + ": " + minStepsRequired);
    }
}