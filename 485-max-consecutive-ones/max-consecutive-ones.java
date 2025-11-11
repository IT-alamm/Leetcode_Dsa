class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int tempCount = 0;
        int finalCount = 0;

        for(int x : nums){
            if(x==1){
                tempCount++;
            }else{
                if(tempCount>finalCount){
                    finalCount = tempCount;  
                }
                tempCount =  0; 
            }
        }
        if(tempCount>finalCount)
            finalCount = tempCount;
        
        return finalCount;
        
    }
}