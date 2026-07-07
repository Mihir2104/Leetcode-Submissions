class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int idx = -1;

        for(int i = n-2; i >=0; i--){
            if(nums[i+1]>nums[i]){
                idx = i;
                break;
            }
        }

        if(idx==-1){
            reverse(nums,0,nums.length - 1);
            return;
        }

        for(int i = n-1; i >=0; i--){
            if(nums[i]>nums[idx]){
                swap(nums,i,idx);
                break;
            }
        }
        reverse(nums, idx + 1, nums.length -1);
    }

    private void reverse(int[] arr,int l, int r){
        while(l<r){
            swap(arr,l,r);
            l++;
            r--;
        }
    }

    private void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}