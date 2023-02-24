class Solution {
    public int minimumDeviation(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : nums) {
            set.add(num % 2 == 0 ? num : num * 2);
        }
        int minDeviation = set.last() - set.first();
        while (set.last() % 2 == 0) {
            int max = set.last();
            set.remove(max);
            set.add(max / 2);
            minDeviation = Math.min(minDeviation, set.last() - set.first());
        }
        return minDeviation;
    }
}
