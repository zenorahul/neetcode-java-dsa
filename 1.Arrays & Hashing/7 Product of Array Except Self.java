class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] arr=new int[nums.length];
        for(int i=0;i<arr.length;i++){
            int prod=1;
            for(int j=0;j<arr.length;j++){
                if(i!=j)
                    prod=prod*nums[j];
            }
            arr[i]=prod;
        }
        return arr;
    }
}  