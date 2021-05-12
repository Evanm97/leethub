class SeatManager {

    PriorityQueue<Integer> queue;
    public SeatManager(int n) {
        queue = new PriorityQueue<Integer>(n);
        for(int i=1; i<=n; i++) {
            queue.add(i);
        }
    }
    
    public int reserve() {
        return queue.poll();
    }
    
    public void unreserve(int seatNumber) {
        queue.add(seatNumber);
    }
}