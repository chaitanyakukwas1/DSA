class Solution {
    public int[] singleNumber(int[] nums) {

        Map<Integer, Integer> freq = new HashMap();

        List<Integer> temp = new ArrayList();

        int[] result = new int[2];

        for(int n : nums){
            freq.put(n,freq.getOrDefault(n,0)+1);
        }

        for(Map.Entry<Integer,Integer> f : freq.entrySet()){
            if(f.getValue() == 1){
                temp.add(f.getKey());
            }
        }
        
        for (int i = 0; i < temp.size(); i++) {
            result[i] = temp.get(i);
        }

        return result;




    }
}