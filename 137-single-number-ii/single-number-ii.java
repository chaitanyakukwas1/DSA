class Solution {
    public int singleNumber(int[] nums) {
        
        Map<Integer, Integer> freq = new HashMap();

        for(int n : nums){
            freq.put(n,freq.getOrDefault(n, 0)+1);
        }

        for(Map.Entry<Integer, Integer> f : freq.entrySet()){
            if(f.getValue() == 1){
                return f.getKey();
            }
        }
        return -1;

    }
}