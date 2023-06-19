class Solution {
    public int largestAltitude(int[] gain) {
        int maximum = 0;
        
        int sum = 0;
        
        for(int altitude: gain) {
            sum += altitude;
            maximum = Math.max(sum, maximum);
        }
        
        
        return maximum;
    }
}