class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length()==0)
            return 0;
        String[] arr = s.split(" ");
        String str = arr[arr.length-1];
        return str.length();
    }
}