class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
         int mid  = 0;
         int end = nums.length-1;
         while(mid<=end){
            if(nums[mid]==0){
                swapArr(nums,start,mid);
                start++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                swapArr(nums,mid,end);
                end--;
            }
         }
    }

    public void swapArr(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}