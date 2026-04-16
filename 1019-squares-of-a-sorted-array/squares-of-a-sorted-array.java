class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int res[] = new int[nums.length];

        int i = 0,
            j = nums.length -1;
        
        int k = nums.length - 1;

        while(i<=j)
        {
            if(Math.abs(nums[i]) > Math.abs(nums[j]))
            {
                res[k] = nums[i] * nums[i];
                i++;
            }
            else
            {
                res[k] = nums[j] * nums[j];
                j--;
            }
            k--;
        }
        return res;

    }
}


// public int[] sortedSquares(int[] nums) {
        
//         int n = nums.length;
//         int l = 0,
//             r = nums.length-1;

//         int[] result = new int[n];

//         for(int i=n-1;i>=0;i--)
//         {
//             int val;

//             if(Math.abs(nums[l])>Math.abs(nums[r]))
//             {
//                 val = nums[l];
//                 l++;
//             }else {
//                 val = nums[r];
//                 r--;
//             }
//             result[i] = val * val;
//         }
//         return result;
        
//     }


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