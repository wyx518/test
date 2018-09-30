class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0)
            return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String s:strs)
        {
            char[] sc=s.toCharArray();
            Arrays.sort(sc);
            String key = String.valueOf(sc);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}