class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        Set<Integer> vals = new HashSet<>();
        int l = nums.length;
        for(int i = 0; i < l; i++){
            if(vals.contains(nums[i])){
                return true;
            }
            vals.add(nums[i]);
        }
        return false;
    }
}