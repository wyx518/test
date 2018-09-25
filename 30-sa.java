class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(words.length==0)
            return result;
        HashMap<String, Integer> toFind = new HashMap<String, Integer>();
        HashMap<String, Integer> found = new HashMap<String, Integer>();
        int m = words.length, n = words[0].length();
        for (int i = 0; i < m; i ++){
            if (!toFind.containsKey(words[i])){
                toFind.put(words[i], 1);
            }
            else{
                toFind.put(words[i], toFind.get(words[i]) + 1);
            }
        }
        for (int i = 0; i <= s.length() - n * m; i ++){
            found.clear();
            int j;
            for (j = 0; j < m; j ++){
                int k = i + j * n;
                String stub = s.substring(k, k + n);
                if (!toFind.containsKey(stub)) break;
                if(!found.containsKey(stub)){
                    found.put(stub, 1);
                }
                else{
                    found.put(stub, found.get(stub) + 1);
                }
                if (found.get(stub) > toFind.get(stub)) break;
            }
            if (j == m) result.add(i);
        }
        return result;
    }
}