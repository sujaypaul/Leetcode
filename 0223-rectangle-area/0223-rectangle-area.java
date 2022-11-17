class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        final long x = Math.max(ax1, bx1) < Math.min(ax2, bx2) ? 
            (Math.min(ax2, bx2) - Math.max(ax1, bx1)) : 0;
        final long y = Math.max(ay1, by1) < Math.min(ay2, by2) ? 
            (Math.min(ay2, by2) - Math.max(ay1, by1)) : 0;
        
        return (int) ((ax2 - ax1) * (ay2 - ay1) + (bx2 - bx1) * (by2 - by1) - x * y);
    }
}