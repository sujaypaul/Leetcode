class SmallestInfiniteSet {
    private int curr = 1;
    private TreeSet<Integer> added = new TreeSet<>();

    public SmallestInfiniteSet() {
    }
    
    public int popSmallest() {
        if (added.isEmpty())
            return curr++;
        final int min = added.first();
        added.remove(min);
        return min;
    }
    
    public void addBack(int num) {
         if (num < curr)
            added.add(num);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */

