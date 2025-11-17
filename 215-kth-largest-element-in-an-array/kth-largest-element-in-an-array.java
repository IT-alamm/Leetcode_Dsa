class Solution {
    public int findKthLargest(int[] nums, int k) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int x : nums){
            if(x>max){
                max = x;
            }if(x<min){
                min = x;
            }
        }

        int[] freq = new int[max-min+1];

        for(int x : nums){
            freq[x-min]++;
        }
        
        int count = 0;
         for (int i = freq.length - 1; i >= 0; i--) {
            while(freq[i]-- > 0){
                count++;
                if(count==k)
                    return i+min;
                }
            }
              return -1;
    }
}