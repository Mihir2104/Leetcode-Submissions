class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;

        if(nums.length==0){
            return 0;
        }

        int longest = 1;

        Set<Integer> set = new HashSet<>();

        for(int i : nums){
            set.add(i);
        }

        for(int it : set){
            int cnt = 1 ;
            int x = it;
        if(!set.contains(it - 1)){
            while(set.contains(x+1)){
                x = x + 1;
                cnt = cnt + 1;
            }
           longest = Math.max(longest, cnt);
        }
        }
        return longest;
    }
}