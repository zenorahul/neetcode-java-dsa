class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<strs.size();i++){
            sb.append(strs.get(i)).append("-");
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String> list=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j = i;
            while(str.charAt(j)!='-') j++;

            list.add(str.substring(i, j));
            i=j+1;
        }
        return list;
    }
}