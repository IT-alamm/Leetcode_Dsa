class Solution {
    public void sortColors(int[] nums) {

        int countOne = 0;
        int countZero = 0;
        for(int x : nums){
            if(x==0){
                countZero++;
            }else if(x==1){
                countOne++;
            }
        }

        for(int i = 0; i<nums.length; i++){
            if(i<countZero){
                nums[i] = 0;
            }else if(i<countZero+countOne){
                nums[i] = 1;
            }else{
                nums[i] = 2;
            }
        }
        
    }
}