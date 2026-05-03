class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];
        int product = 1;
        for(int i = 0; i < nums.length; i++){
            product *= nums[i];
            prefix[i] = product;
        }
        product = 1;
        for(int i = nums.length - 1; i >=0; i--){
            product *= nums[i];
            postfix[i] = product;
        }
        // for(int i = 0; i < nums.length;i++){
        //     System.out.print(" "+prefix[i]);
        // }

        for(int i = 0; i < nums.length; i++){
            product = 1;
            if( (i -1 )>= 0){
                product *= prefix[i-1];
            }
            if((i+1) < nums.length){
                product *= postfix[i+1];
            }
            nums[i] = product;
        }
        return nums;
    }
}  
