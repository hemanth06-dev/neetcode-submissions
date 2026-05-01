class Solution {
    public int removeElement(int[] nums, int val) {
       int startInd =0;
       int endInd = nums.length -1;
       while(startInd <= endInd){
        if(nums[startInd] != val){
            startInd++;
        }else if(nums[endInd] == val){
            endInd--;
        }else{
            nums[startInd] = nums[endInd];
            startInd++;
            endInd--;
        }
       }
       return startInd;
    }
}