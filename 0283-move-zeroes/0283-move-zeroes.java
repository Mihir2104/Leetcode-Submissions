class Solution {
    public void moveZeroes(int[] nums) {
        int j =-1;

        for(int i=0; i< nums.length; i++){
            if(nums[i]==0){
                j = i;
                break;
            }
        }

        for(int i=j+1; i< nums.length; i++){
            if(j==-1){
                break;
            }
            if(nums[i]!=0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }

        }
       

        
    }
}