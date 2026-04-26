class Solution {
    public String removeStars(String s) {
        if (s.length() == 0)
            return "";
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != '*')
                st.push(ch);
            else {
                if (!st.isEmpty())
                    st.pop();
            }
        }
        StringBuilder result = new StringBuilder();
        for(char ch : st){
            result.append(ch);
        }
        return result.toString();
    }
}