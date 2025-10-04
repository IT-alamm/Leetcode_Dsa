import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k == 0) {
            return; 
        }

        int n = nums.length;
        k = k % n; 

        // 1. Copy elements from the array to an ArrayList
        List<Integer> l1 = new ArrayList<>();
        for (int a : nums) {
            l1.add(a);
        }
        
        // 2. Rotate the ArrayList once
        Collections.rotate(l1, k);
        
    
        for (int i = 0; i < n; i++) {
            nums[i] = l1.get(i);
        }
    }
}