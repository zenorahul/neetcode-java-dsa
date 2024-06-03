class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res_set=new HashSet<>();
         for (int i = 0; i < nums.length-2; i++) {
             for (int j = i+1; j < nums.length-1; j++) {
                 for (int k = j+1; k < nums.length; k++) {
                    int sum=nums[i]+nums[j]+nums[k];
                    if(sum==0){
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                        res_set.add(triplet);
                    }
                 }
             }
         }
         List<List<Integer>> al=new ArrayList<>(res_set);
         return al;
    }
}