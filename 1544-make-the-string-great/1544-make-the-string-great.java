class Solution {
  public String makeGood(String s) {
    var sb = new StringBuilder();
    for (int i = 0; i < s.length(); ++i) {
      int l = sb.length();
      if (l > 0 && Math.abs(sb.charAt(l - 1) - s.charAt(i)) == 32) {
        sb.setLength(l - 1); // remove last char
      } else {
        sb.append(s.charAt(i));
      }
    }
    return sb.toString();
  }
}