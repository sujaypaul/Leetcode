class Solution {
    public int longestPalindrome(String[] words) {
        Map<String, Integer> stringCount = new HashMap<>();
        int res = 0;
        int numSelfPalindrome = 0;
        int n = words.length;
        for (int i = 0; i < n ; i++) {
            String s = words[i];
            char a = s.charAt(0);
            char b = s.charAt(1);
            if (stringCount.containsKey(s)) {
                // match found
                res += 4;
                stringCount.put(s, stringCount.get(s) - 1);
                if (stringCount.get(s) == 0) {
                    stringCount.remove(s);
                }
                if (a == b) {
                    numSelfPalindrome--;
                }
            } else if (a == b) {
                // same chars
                stringCount.put(s, 1);
                numSelfPalindrome++;
            } else {
                // reverse string and add to set
                String toAdd = "" + b + a;
                if (!stringCount.containsKey(toAdd)) {
                    stringCount.put(toAdd, 1);
                } else {
                    stringCount.put(
                        toAdd, stringCount.get(toAdd) + 1);
                }
            }
        }
        if (numSelfPalindrome > 0) {
            res += 2;
        }
        return res;
    }
}