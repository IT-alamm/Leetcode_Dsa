class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\s+");
        String stringReverse = "";

        for (String word : words) {
            stringReverse = stringReverse + " " + new StringBuilder(word).reverse().toString();

        }
        return stringReverse.trim();
    }
}