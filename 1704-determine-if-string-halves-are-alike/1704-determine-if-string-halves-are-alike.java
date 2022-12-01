class Solution {
    public boolean halvesAreAlike(String s) {
        int l=0;
        int r=0;
        for(int i=0,j=s.length()-1;i<j;i++,j--){
            if(s.charAt(i)=='a'||s.charAt(i)=='A'||s.charAt(i)=='e'||s.charAt(i)=='E'
               ||s.charAt(i)=='i'||s.charAt(i)=='I'
               ||s.charAt(i)=='o'||s.charAt(i)=='O'
               ||s.charAt(i)=='u'||s.charAt(i)=='U')
                l++;
            
            if(s.charAt(j)=='a'||s.charAt(j)=='A'||s.charAt(j)=='e'||s.charAt(j)=='E'
               ||s.charAt(j)=='i'||s.charAt(j)=='I'
               ||s.charAt(j)=='o'||s.charAt(j)=='O'
               ||s.charAt(j)=='u'||s.charAt(j)=='U')
                r++;
        }
        if(l==r)
            return true;
        
        return false;
        
    }
}