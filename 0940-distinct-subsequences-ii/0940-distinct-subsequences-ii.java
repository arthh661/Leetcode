class Solution {
    public int distinctSubseqII(String s) {
        final int MOD = 1_000_000_007;

        // dp[i] = number of distinct non-empty subsequences
        // after processing first i characters
        long[] dp = new long[s.length() + 1];

        // last[c] = number of distinct subsequences
        // that were already created when character c appeared last
        long[] last = new long[26];

        for (int i = 1; i <= s.length(); i++) {
            int c = s.charAt(i - 1) - 'a';

            // Every existing subsequence can either:
            // 1. Not use current character
            // 2. Append current character
            //
            // +1 represents the subsequence containing only current char
            dp[i] = (2 * dp[i - 1] + 1 - last[c]) % MOD;

            if (dp[i] < 0) {
                dp[i] += MOD;
            }

            // Current character now represents the latest
            // set of subsequences ending with this character.
            last[c] = (dp[i - 1] + 1) % MOD;
        }

        return (int) dp[s.length()];
    }
}