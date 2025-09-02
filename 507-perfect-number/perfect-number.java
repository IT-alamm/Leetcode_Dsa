class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        int i = 1;
        while(i<num){
            if(num%i==0){
                int fact1 = i;
                sum +=fact1;   
            }
            i++;
        }
        if(sum==num){
            return true;
        }else{
           return false;
        }
        
    }
}