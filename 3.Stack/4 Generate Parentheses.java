class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        recursive(n,0,0,"",list);
        return list;
    }
    public void recursive(int n,int open,int close,String s,List<String> list){
        if(s.length()==n*2){
            list.add(s);
            return;
        }
        if(open<n)
            recursive(n,open+1,close,s+"(",list);
        if(close<open)
            recursive(n,open,close+1,s+")",list);
    }
}
