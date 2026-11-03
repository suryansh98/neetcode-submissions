class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashMap<Character, Integer> hs = new HashMap<>();


        int max = 1, lastSame = 0;

        if(s.length() == 0)
            return 0;
        
        hs.put(s.charAt(0), 0);

        for(int i = 1; i < s.length(); i++){

            char ch = s.charAt(i);

            if(hs.containsKey(ch))
            {
                int val = hs.get(ch);

                lastSame = (int)Math.max(val + 1, lastSame);

                hs.put(ch, i);
            }
            else{

                hs.put(ch, i);
            }

            max = (int)Math.max(max, i - lastSame + 1);
        }

        return max;

    }
}
