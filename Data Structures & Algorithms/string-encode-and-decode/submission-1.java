class Solution {

    public String encode(List<String> strs) {
        StringBuilder sCombined = new StringBuilder();

        for (String s : strs) {
            int len = s.length();
            sCombined.append(len).append("#").append(s);
            
        }

        return sCombined.toString();
    }

    public List<String> decode(String str) {

       
       int n = str.length();
       List<String> ans = new ArrayList<>();
        String num = "";
       for(int i = 0; i < n; )
       {
            int j = i;

            while(str.charAt(j) != '#')
                j++;

            int len = Integer.parseInt(str.substring(i, j));

            ans.add(str.substring(j + 1, j + 1 + len));

            i = j + 1 + len;

       }

        return ans;
    }
}
