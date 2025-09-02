class Solution {
    public boolean isThree(int n) {
        int i = 1;
        int count = 0;
        while(i*i<=n){
            if(n%i==0){
                int fact1 = i;
                int fact2 = n/i;
                if(fact1 == fact2){
                    count++;
                }else{
                    count +=2;
                }
            }
            i++;
        }
        if(count==3){
            return true;
        }else{
            return false;
        }
        
    }
}