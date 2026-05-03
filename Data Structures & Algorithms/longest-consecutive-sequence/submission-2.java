class Solution {
    public int longestConsecutive(int[] nums) {

        int max_count = 0;
        int max_element = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            int j = 0;
            int val = nums[i] + 1;
            int c = 1;
            // System.out.println("max element: "+max_element + " c: " +c + " max_count: " +max_count + " val : "+val+" i: "+i);
            // if(max_element > val) continue;
            while ( j < nums.length){
                // System.out.println("nums[j] : "+nums[j]+ " j : "+j+" val: "+val);
                if(nums[j] == val){
                    // System.out.println("TRUE");
                    c++;
                    val++;
                    j = 0;
                }else{
                    j++;
                }
            }
            max_count = Math.max(c,max_count);
            max_element = Math.max(val,max_element);
        }
        return max_count;
        
    }
}
