class Solution {

    public boolean wordBreak(String s, List<String> wordDict) {
        Boolean[] dp = new Boolean[s.length()];
        return solve(0, s, wordDict, dp);
    }

    boolean solve(int i, String s, List<String> dict, Boolean[] dp) {

        if (i == s.length())
            return true;

        if (dp[i] != null)
            return dp[i];

        for (String word : dict) {

            if (s.startsWith(word, i)) {

                if (solve(i + word.length(), s, dict, dp))
                    return dp[i] = true;
            }
        }

        return dp[i] = false;
    }
}