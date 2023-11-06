class SeatManager {
  public SeatManager(int n) {}

  public int reserve() {
    if (minHeap.isEmpty())
      return ++num;
    return minHeap.poll();
  }

  public void unreserve(int seatNumber) {
    minHeap.offer(seatNumber);
  }

  private Queue<Integer> minHeap = new PriorityQueue<>();
  private int num = 0;
}


/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */