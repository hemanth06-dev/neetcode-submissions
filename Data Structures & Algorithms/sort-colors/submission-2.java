class Solution {
    public void sortColors(int[] nums) {

        int redPointer = -1;
        int bluePointer = nums.length;

        int i = 0;
        while (i < bluePointer){
            // if current value is '0' then swap with red pointer
            // if current value is '2' swap with blue pointer
            if(i == redPointer) {
                i++;
                continue;
            };
            if(nums[i] == 0){
                swap(i,++redPointer,nums);
                
            }else if(nums[i] == 2){
                swap(i,--bluePointer,nums);
               
            }else{
                i++;
            }
            
        }
        
    }
    void swap(int i,int j, int[] nums){
        int t = nums[i];
        nums[i]= nums[j];
        nums[j]= t;
    }
}