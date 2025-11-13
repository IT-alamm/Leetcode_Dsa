
class Solution {
    public void rotate(int[] nums, int k) {

        // List<Integer> l1 = new ArrayList<>();

        // for(int a : nums){
        //     l1.add(a);
        // }

        // Collections.rotate(l1,k);

        // for(int i = 0; i<l1.size(); i++){
        //     nums[i] = l1.get(i);
        // }

        k = k%nums.length;

        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }
    public static void reverse(int nums[], int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }



    }
}