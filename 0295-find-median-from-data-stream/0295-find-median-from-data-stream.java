class MedianFinder {
PriorityQueue<Integer> minheap;
    PriorityQueue<Integer> maxheap;
    int size;
    public MedianFinder() {
        minheap = new PriorityQueue<>();
        maxheap = new PriorityQueue<>(Collections.reverseOrder());
    }
    
    public void addNum(int num) {
        minheap.add(num); 
        if(maxheap.size()<minheap.size())
            maxheap.add(minheap.poll()); 
         if(minheap.size()<maxheap.size())
             minheap.add(maxheap.poll()); 
    }
    
    public double findMedian() {
        return minheap.size()>maxheap.size()?minheap.peek()*1.0:              (minheap.peek()+maxheap.peek())*0.5;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */