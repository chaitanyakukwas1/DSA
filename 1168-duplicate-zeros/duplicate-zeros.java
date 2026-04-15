class Solution {
    public void duplicateZeros(int[] arr) {
        
        ArrayList<Integer>array = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                array.add(arr[i]);
            }
            else
            {
                array.add(0);
                array.add(0);
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = array.get(i);
        }
    }
}