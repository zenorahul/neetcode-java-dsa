class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],1+hm.getOrDefault(nums[i],0));
        }

        List<Integer>[] bucket = new List[nums.length + 1];
        for (int key : hm.keySet()) {
            int value_freq = hm.get(key);
            if (bucket[value_freq] == null) {
                bucket[value_freq] = new ArrayList<>();
            }
            bucket[value_freq].add(key);
        }
        int[] ans = new int[k];
        int pos = 0;
        for (int i = bucket.length - 1; i >= 0; i--) {
            if (bucket[i] != null) {
                for (int j = 0; j < bucket[i].size() && pos < k; j++) {
                    ans[pos] = bucket[i].get(j);
                    pos++;
                }
            }
        }
        return ans;
    }
}
