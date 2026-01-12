class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : stones) {
            pq.add(num);
        }
        while (pq.size() > 1) {
            int max = pq.poll();
            int sMax = pq.poll();
            int nStone = max - sMax;

            if (nStone != 0) {
                pq.add(nStone);
            }
        }
        if (pq.size() == 0)
            return 0;
        else
            return pq.remove();
    }
}