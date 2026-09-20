class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> result = new ArrayList();

        int maxNum = 0;

        for(int candi : candies){
            maxNum = Math.max(maxNum, candi);
        }

        for(int i = 0;i< candies.length;i++)
        {
            if(candies[i]+extraCandies  >= maxNum){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }

        return result;

    }
}