class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> hm = new HashMap<>();

        for(int i = 0; i < strs.length; i++)
        {
            char s[] = strs[i].toCharArray();

            Arrays.sort(s);

            String sNew = new String(s);

            if(hm.containsKey(sNew)){
                List<String> subList = hm.get(sNew);

                subList.add(strs[i]);

                hm.put(sNew, subList);
            }
            else{
                List<String> subList = new ArrayList<>();

                subList.add(strs[i]);

                hm.put(sNew, subList);
            }

        } 
        List<List<String>> finalList = new ArrayList<>();
        hm.forEach((key, value) -> {
            finalList.add(value);
        });

        return finalList;
    }
}
