class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniques = new HashSet<>();
        
        for(int i : nums){
            if(uniques.contains(i)){
                return true;
            }
            uniques.add(i);
        }
        return false;
    }
}