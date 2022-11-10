class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();

         for (char c : s.toCharArray()) {
            int n = sb.length();
            if (n > 0 && sb.charAt(n - 1) == c)
                sb.deleteCharAt(n - 1);
            else
                sb.append(c);
        }
        return sb.toString();
    }
}