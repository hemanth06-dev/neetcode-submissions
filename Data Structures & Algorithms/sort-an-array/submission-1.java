class Solution {
    public int[] sortArray(int[] nums) {
        // merge sort
        mergeSort(0,nums.length -1, nums);
        return nums;
    }

    void mergeSort(int start,int end, int nums[]){
        if((end - start) <= 0) return;

        int mid = (start + end)/ 2;

        mergeSort(start,mid,nums);
        mergeSort(mid+1, end,nums);
        merge(start,mid,end,nums);
    }
    void merge(int start, int mid, int end, int nums[]){
        int l = start;
        int r = mid+1;
        int[] temp = new int[end-start+1];
        int c = 0;
        while( l <= mid && r <= end){
            if(nums[l] < nums[r]){
                temp[c++] = nums[l++];
            }else{
                temp[c++] = nums[r++];
            }
        }
        if(l <= mid){
            for(;l <= mid; l++){
                temp[c++] = nums[l];
            }
        }
        if(r <= end){
            for(; r<=end; r++){
                temp[c++] = nums[r];
            }
        }
        for(int i =0; i < c; i++){
            nums[start + i] = temp[i];
        }
    }
}