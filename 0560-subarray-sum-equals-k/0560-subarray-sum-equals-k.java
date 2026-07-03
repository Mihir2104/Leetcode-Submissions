class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        map.put(0,1);
        int prefix = 0;
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            prefix = prefix + nums[i];
            int num = prefix - k;
            if(map.containsKey(num)){
                count = count + map.get(num);
            }
            
            map.put(prefix,map.getOrDefault(prefix,0)+1);
        }
        return count;
    }
}