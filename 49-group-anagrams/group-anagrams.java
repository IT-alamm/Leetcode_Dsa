class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {

            char[] arr = word.toCharArray();
            Arrays.sort(arr);

            // convert char array into string
            String newWord = new String(arr);

            // it checks the newWord are present or not
            if (!map.containsKey(newWord)) {
                map.put(newWord, new ArrayList<>());
            }
            map.get(newWord).add(word);
        }

        return new ArrayList<>(map.values());
    }
}