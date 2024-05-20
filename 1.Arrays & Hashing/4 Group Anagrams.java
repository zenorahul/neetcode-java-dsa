class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm=new HashMap<>();

        for(String word:strs){
            char[] c=word.toCharArray();
            Arrays.sort(c);
            String sortedWord=new String(c);

            if(!hm.containsKey(sortedWord)){
                hm.put(sortedWord,new ArrayList<>());
            }
            hm.get(sortedWord).add(word);
        }
        return new ArrayList<>(hm.values());
    }
}