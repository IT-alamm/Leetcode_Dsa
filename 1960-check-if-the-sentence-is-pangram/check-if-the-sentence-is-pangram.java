class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] freq = getFreq(sentence);

        for(int i = 0; i<freq.length; i++){
            if(freq[i]==0)
                return false;
        }
        return true;
    }

    public int[] getFreq(String s){
        int[] freq = new int[26];

        for(int i = 0; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
        }
        return freq;
    }
}