public class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int i = 0; // Target pointer
        int num = 1; // Current num

        while (i < target.length) {
            int t = target[i];
            if (t == num) {
                ans.add("Push");
                i++;
            } else {
                ans.add("Push");
                ans.add("Pop");
            }
            num++;
        }

        return ans;
    }
}
