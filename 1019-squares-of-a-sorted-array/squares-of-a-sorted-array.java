class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int N = nums.length;
        int arr[] = new int[N];

        for(int i=0;i<N;i++)
        {
            arr[i] = nums[i]*nums[i];
        }
        Arrays.sort(arr);
        return arr;
    }
}