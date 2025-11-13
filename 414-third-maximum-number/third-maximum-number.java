class Solution {
    public int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;

        for(int x : nums){
            if(x > max){
                thirdMax = secondMax;
                secondMax = max;
                max = x;
            }else if(x > secondMax && x!=max){
                thirdMax = secondMax;
                secondMax = x;
            }else if(x > thirdMax && x!= max && x!= secondMax){
                thirdMax = x;
            }
        }
        return thirdMax != Long.MIN_VALUE ? (int)thirdMax : (int)max;
    }
}