// Time complexity - O(N) where N is the length of nums
// Space complexity - O(N)
// Run on leetcode - Yes
// Issues - missed the edge case i != map.get(target - nums[i])

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] res = new int[2];
        if(nums == null || nums.length == 0)
            return res;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], i);
        }
        
        for(int i=0; i<nums.length; i++){
          //search for complement
            if(map.containsKey(target - nums[i]) && i != map.get(target - nums[i])){
                res[0] = i;
                res[1] = map.get(target - nums[i]);
                return res;
            }
        }
        return res;

    }
}
