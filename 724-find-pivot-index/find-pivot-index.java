class Solution {
    public int pivotIndex(int[] nums) {
        int tSum = 0;
        for (int num : nums) {
            tSum += num;
        }

        int lSum = 0;
        for (int i = 0; i < nums.length; i++) {
            tSum -= nums[i];

            if (tSum == lSum)
                return i;

            lSum += nums[i];
        }
        return -1;
    }
}