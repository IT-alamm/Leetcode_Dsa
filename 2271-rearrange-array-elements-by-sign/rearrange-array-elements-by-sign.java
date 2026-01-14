class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];
        int p= 0; int n = 1;

        for(int x : nums){
            if(x>0){
                arr[p] = x;
                p += 2;
            }else{
                arr[n] = x;
                n +=2;
            }
        }
        return arr;
    }
}