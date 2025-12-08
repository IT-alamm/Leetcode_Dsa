class Solution {
    public String reverseWords(String s) {
        String words[] = s.split("\s+");
        String reverse = "";
        for (String word : words) {
            reverse = word + " " + reverse;
        }

        return reverse.trim();
    }
}