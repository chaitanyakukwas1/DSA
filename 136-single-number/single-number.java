class Solution {
    public int singleNumber(int[] nums) {

        int count = 0;

        int num = nums[0];
        Map<Integer, Integer> freq = new HashMap();

        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return -1;
    }
}