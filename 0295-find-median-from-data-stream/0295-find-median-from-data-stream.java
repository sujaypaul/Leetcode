class MedianFinder {
    
     private Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
     private Queue<Integer> minHeap = new PriorityQueue<>();

    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if (maxHeap.isEmpty() || num <= maxHeap.peek())
            maxHeap.offer(num);
        else
            minHeap.offer(num);

        // Balance two heaps s.t.
        // |maxHeap| >= |minHeap| and |maxHeap| - |minHeap| <= 1
        if (maxHeap.size() < minHeap.size())
            maxHeap.offer(minHeap.poll());
        else if (maxHeap.size() - minHeap.size() > 1)
            minHeap.offer(maxHeap.poll());
    }
    
    public double findMedian() {
        if (maxHeap.size() == minHeap.size())
            return (double) (maxHeap.peek() + minHeap.peek()) / 2.0;
        
        return (double) maxHeap.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */