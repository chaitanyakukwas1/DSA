class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxNum = 0; // 

        int currentNum = 0; //1
        
        for(int i = 0;i< nums.length;i++){
            if(nums[i] == 0){
                currentNum = 0;
                
            }else{
                currentNum +=1;
            }      
            maxNum = Math.max(currentNum, maxNum);
            
            
        }
        return maxNum;
    }
}