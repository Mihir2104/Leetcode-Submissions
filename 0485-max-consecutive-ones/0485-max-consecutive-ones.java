class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int left =0;
        int longest =0;

        for(int right=0; right < nums.length; right++){

            if(nums[right]!=1){

                while(left<=right){
                    left++;
                }

            }

            longest = Math.max(longest,right - left + 1);

        }

        return longest;
        
    }
}