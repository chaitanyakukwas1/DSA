class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> freq = new HashMap();

        for(int n : nums){
            freq.put(n, freq.getOrDefault(n,0)+1);
        }

        List<Integer> temp = new ArrayList<Integer>(freq.keySet());

        temp.sort((a,b) -> freq.get(b) - freq.get(a));

        int[] result = new int[k];

        for(int i = 0;i<k;i++){
            result[i] = temp.get(i);

        }
        return result;
         


        
    }
}