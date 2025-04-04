import java.util.*;

class Solution {
    public int minOperations(int[] nums, int k) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        
        int count = 0;
        if (n == 1 && k == nums[0]) {
            return 0;
        }
        
        int x = 0;
        for (int no : set) {
            if (no > k) {
                count++;
            } else if (no < k) {
                x++;
            }
        }
        
        if (x == 0) {
            return count;
        } else {
            return -1;
        }
    }
}
