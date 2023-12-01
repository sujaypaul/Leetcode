class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String word1final="";
        String word2final="";
        for (String w1 : word1){
            word1final = word1final+w1;
        }
        for (String w2 : word2){
            word2final = word2final+w2;
        }
        if(word1final.equals(word2final)){
            return true;
        }
        return false;
    }
}