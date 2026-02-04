class Solution {
    public int findGCD(int[] nums) {
int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    for (int x : nums) {
        min = Math.min(min, x);
        max = Math.max(max, x);
    }

    while (min != 0) {
        int temp = min;
        min = max % min;
        max = temp;
    }

    return max;
    }
}