class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0] = findFirst(nums,target,true);
        arr[1]=findFirst(nums,target,false);

        return arr;
    }

    public int findFirst(int[] nums, int target, boolean oc){
        int low = 0;
        int high = nums.length-1;
        int res = -1;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid]==target && oc == true){
                res = mid;
                high = mid -1;
            }
            else if(nums[mid]==target && oc == false){
                res = mid;
                low = mid +1;
            }
            else if(target>nums[mid]){
                low = mid +1;
            }
            else{
                high = mid - 1;
            }
        }
        return res;
    }
}