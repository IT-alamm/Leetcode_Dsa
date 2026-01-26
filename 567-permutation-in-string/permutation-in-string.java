class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            freq[ch - 'a']++;
        }

        int windowSize = s1.length();

        for (int i = 0; i < s2.length(); i++) {
            int windowIdx = 0;
            int idx = i;
            int[] windowFreq = new int[26];
            while (windowIdx < windowSize && idx < s2.length()) {
                char ch = s2.charAt(idx);
                windowFreq[ch - 'a']++;
                windowIdx++;
                idx++;
            }
            if (isSameFreq(freq, windowFreq))
                return true;
        }
        return false;
    }

    public boolean isSameFreq(int[] freq1, int[] freq2) {
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i])
                return false;
        }
        return true;
    }
}