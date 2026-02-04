class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> hs = new HashSet<>();

        for(int candy : candyType){
            hs.add(candy);
        }

        int n = candyType.length;

        return Math.min(hs.size(), n/2);
    }
}