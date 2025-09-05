class Solution {
    public boolean hasAlternatingBits(int n) {
        int prev = n%2;
        n=n/2;
        while(n>0){

            int next = n%2;
            if(prev==next){
                return false;
            }
            prev = next;
            n=n/2;
        }
        return true;
        
    }
}