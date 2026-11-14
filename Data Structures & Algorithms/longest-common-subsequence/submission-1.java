class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] seen = new int[text1.length()][text2.length()];

        for(int[] arr: seen)
        {
            Arrays.fill(arr, -1);
        }
        return traverse(text1, text2, text1.length() - 1, text2.length() - 1, seen);
    }


    public int traverse(String txt1, String txt2, int n, int m, int[][] seen)
    {
        if(n < 0 || m < 0)
            return 0;
        
        if(seen[n][m] != -1)
            return seen[n][m];
        if(txt1.charAt(n) == txt2.charAt(m))
        {
             return seen[n][m] = 1 + traverse(txt1, txt2, n - 1, m - 1, seen);
        }
        else
            return  seen[n][m] = Math.max(traverse(txt1, txt2, n - 1, m, seen), traverse(txt1, txt2, n, m- 1, seen));
    }
}
