class Solution {
    public int countVowelPermutation(int n) {
        char[] vowel = {'a', 'e', 'i', 'o', 'u'};
        long[][] dp = new long[n][5];
        int MOD = (int) 1e9 + 7;
        for(int i=0;i<5;i++){
            dp[0][i] = 1;
        }
        // a:0, e:1, i:2, o:3, u:4
        for(int i=1;i<n;i++){
            // e,i,u->a
            dp[i][0] = (dp[i-1][1]) % MOD;
            // a,i->e
            dp[i][1] = (dp[i-1][0] + dp[i-1][2]) % MOD;
            // e,o->i
            dp[i][2] = (dp[i-1][0] + dp[i-1][1] + dp[i-1][3] + dp[i-1][4]) % MOD;
            // i->o
            dp[i][3] = (dp[i-1][2] + dp[i-1][4]) % MOD;
            // i->u
            dp[i][4] = (dp[i-1][0]) % MOD;
        }
        long count = 0;
        for(int col=0;col<5;col++)
            count= (count+dp[n-1][col]) % MOD;
        return (int) count;
    }
}