class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;

        if(nums.length==0){
            return 0;
        }

        Set<Integer> set = new HashSet<>();

       int longest = 1;
       

       for(int i : nums){
        set.add(i);
       }

       for(int st : set ){
         int x = st - 1;
         int count = 0;
        if(!set.contains(st - 1)){
            while(set.contains(x+1)){
                count++;
                x++;
            }
        }

        longest = Math.max(longest, count);
       }

       return longest ;
    }
}