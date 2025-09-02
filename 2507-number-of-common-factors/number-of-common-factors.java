class Solution {
    public int commonFactors(int a, int b) {
        int count = 0;
        int i = 1; 
        while(i<=a && i<=b){
            if(a%i==0 && b%i==0){
                int fact = i;
                count++;
            }
            i++;
        }
        return count;
        
    }
}