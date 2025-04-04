class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                result[i] = nums[i];
            } else {
                // Compute the new index with circular behavior
                int newIndex = (i + nums[i]) % n;
                if (newIndex < 0) {
                    newIndex += n; // Handle negative indices
                }
                result[i] = nums[newIndex];
            }
        }

        return result;

    }
}