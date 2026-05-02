class Solution {
    public int[] sortArray(int[] nums) {
       //quick sorting
        quickSort(0,nums.length -1, nums);
        return nums;
    }

    void quickSort(int start,int end, int[] nums){
        System.out.println("start : "+start+ " end: "+end);
        if(start >= end) return;
        
        int pivot = partition(start,end,nums);
        System.out.println("pivot: "+pivot);
        quickSort(start,pivot -1, nums);
        quickSort(pivot + 1, end,nums);
    }

    int partition(int start,int end,int[] nums){
        int pivotValue = nums[start];
        int l = start+1;
        int r = end;

        while( l <= r){
            
            if(nums[l] < pivotValue){
                l++;
            }else if(nums[r]> pivotValue){
                r--;
            }else{
                swap(l,r,nums);
                l++;
                r--;
            }
        }
        swap(r,start,nums);
        return r;

    }

    void swap(int i,int j, int[] nums){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }


    // void mergeSort(int start,int end, int nums[]){
    //     if((end - start) <= 0) return;

    //     int mid = (start + end)/ 2;

    //     mergeSort(start,mid,nums);
    //     mergeSort(mid+1, end,nums);
    //     merge(start,mid,end,nums);
    // }
    // void merge(int start, int mid, int end, int nums[]){
    //     int l = start;
    //     int r = mid+1;
    //     int[] temp = new int[end-start+1];
    //     int c = 0;
    //     while( l <= mid && r <= end){
    //         if(nums[l] < nums[r]){
    //             temp[c++] = nums[l++];
    //         }else{
    //             temp[c++] = nums[r++];
    //         }
    //     }
    //     if(l <= mid){
    //         for(;l <= mid; l++){
    //             temp[c++] = nums[l];
    //         }
    //     }
    //     if(r <= end){
    //         for(; r<=end; r++){
    //             temp[c++] = nums[r];
    //         }
    //     }
    //     for(int i =0; i < c; i++){
    //         nums[start + i] = temp[i];
    //     }
    // }
}