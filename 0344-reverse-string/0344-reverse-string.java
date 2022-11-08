class Solution {
    public void reverseString(char[] s) {
        for(int i=0,j=s.length-1; i<j ;i++,j--){
            s[i]= (char)((int)s[i]+(int)s[j]);
            s[j]= (char)((int)s[i]-(int)s[j]);
            s[i]= (char)((int)s[i]-(int)s[j]);
        }
    }
}