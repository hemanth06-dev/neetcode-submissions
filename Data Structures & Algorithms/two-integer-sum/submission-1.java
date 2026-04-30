class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numsMap = new HashMap<>();

        for(int i =0; i < nums.length; i++){
            numsMap.put(nums[i],i);
        }
        for(int i = 0; i < nums.length; i++){
            int result = target - nums[i];
            if( numsMap.containsKey(result) && numsMap.get(result) != i){
                return new int[]{Math.min(numsMap.get(result),i),Math.max(numsMap.get(result),i)};
            }
        }
        return new int[]{};
    }
}
