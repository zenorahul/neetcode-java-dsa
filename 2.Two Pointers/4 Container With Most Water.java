class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j=heights.length-1;
        int res=0;
        while(i<j){
            int w=Math.min(heights[i],heights[j]);
            int l=j-i;
            int area=w*l;
            res=Math.max(res,area);
            if(heights[i]<heights[j])
                i++;
            else
                j--;
        }
        return res;
    }
}
