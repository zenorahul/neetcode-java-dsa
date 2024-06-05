class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int size=temperatures.length;
        int res[]=new int[size];
        int k=0;
        for(int i=0;i<size;i++){
            int v=temperatures[i];
            for(int j=i+1;j<size;j++){
                if(temperatures[j]>v){
                    res[k]=j-i;
                    break;
                }  
                else
                    res[k]=0;
            }
            k++;
        }
        return res;
    }
}
