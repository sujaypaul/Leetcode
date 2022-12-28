class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
        int sum = 0;
        for (int p : piles) {
            sum += p;
            queue.offer(p);
        }
  
        while (k != 0) {
            int cur = queue.poll();
            if (cur < 2) {
                break;
            }
            int remove = cur / 2;
            cur -= remove;
            sum -= remove;
            queue.offer(cur);
            k--;
        }
        return sum;
    }
}