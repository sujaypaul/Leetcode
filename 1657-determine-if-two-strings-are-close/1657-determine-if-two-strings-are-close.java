class Solution {
    public boolean closeStrings(String word1, String word2) {
        int x= word1.length();
        int y = word2.length();
        if(x != y) return false;
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for(int i=0; i<x; i++){
            arr1[word1.charAt(i)-'a']++;
        }
         for(int i=0; i<y; i++){
            arr2[word2.charAt(i)-'a']++;
        }
        for (int i = 0; i <26; i++) {
            if (arr1[i] == arr2[i]) {
                continue;
            }
            if (arr1[i] == 0 || arr2[i] == 0) {
                return false;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i <26; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}