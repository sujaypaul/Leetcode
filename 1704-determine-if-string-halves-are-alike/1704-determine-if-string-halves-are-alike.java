class Solution {
    public boolean halvesAreAlike(String s) {
        int l=0;
        int r=0;
        for(int i=0,j=s.length()-1;i<j;i++,j--){
            if( isVowel(s.charAt(i)) )
                l++;
            
            if( isVowel(s.charAt(j)) )
                r++;
        }
        if(l==r)
            return true;
        
        return false;
        
    }
    
    public boolean isVowel(char i){
        if(i=='a'||i=='A'||i=='e'||i=='E'
               ||i=='i'||i=='I'
               ||i=='o'||i=='O'
               ||i=='u'||i=='U')
            return true;
        else
        return false;
    }
}