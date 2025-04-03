import java.util.List;

class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int minSum = Integer.MAX_VALUE;
        boolean found = false;

        for (int length = l; length <= r; length++) {

            int currentSum = 0;
            for (int i = 0; i < length; i++) {
                currentSum += nums.get(i);
            }

            if (currentSum > 0) {
                minSum = Math.min(minSum, currentSum);
                found = true;
            }

            for (int start = 1; start <= n - length; start++) {
                currentSum = currentSum - nums.get(start - 1) +                       nums.get(start + length - 1);
                
                if (currentSum > 0) {
                    minSum = Math.min(minSum, currentSum);
                    found = true;
                }
            }
        }

        return found ? minSum : -1;
    }
}