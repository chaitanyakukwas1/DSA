class Solution {
    public int[] twoSum(int[] nums, int target) {
        //[2,7,11,15] target=9
        Map<Integer,Integer> map = new HashMap();
        for(int i=0;i<nums.length;i++)
        {
            int diff = target-nums[i]; //9-2=7
            if(map.containsKey(diff))
            {
                return new int[]{map.get(diff),i};
            }
            map.put(nums[i],i);
        }
        return null;

    }
}
 













