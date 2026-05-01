class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> elementCount = new HashMap<>();

        for(int i =0; i< nums.length; i++){
            elementCount.put(nums[i],elementCount.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> entry: elementCount.entrySet()){
            int key = entry.getKey();
            int val = entry.getValue();
            if(val > (nums.length/2)) return key;
        }
        return 0;
    }
}