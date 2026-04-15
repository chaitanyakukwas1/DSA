class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int n = nums.length;
        int l = 0,
            r = nums.length-1;

        int[] result = new int[n];

        for(int i=n-1;i>=0;i--)
        {
            int val;

            if(Math.abs(nums[l])>Math.abs(nums[r]))
            {
                val = nums[l];
                l++;
            }else {
                val = nums[r];
                r--;
            }
            result[i] = val * val;
        }
        return result;
        
    }
}





// public int[] sortedSquares(int[] nums) {
        
//         int N = nums.length;
//         int arr[] = new int[N];

//         for(int i=0;i<N;i++)
//         {
//             arr[i] = nums[i]*nums[i];
//         }
//         Arrays.sort(arr);
//         return arr;
//     }