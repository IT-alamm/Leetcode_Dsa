class Solution {
    public int bulbSwitch(int n) {
        // return (int)Math.sqrt(n);
        int count = 0;
        int i = 1;
        while(i*i<=n){
            count++;
            i++;
        }
        return count;
    }
}