class Solution {
    public int[] runningSum(int[] nums) {
        int[] n = new int[nums.length];

        for(int i=0; i<=nums.length-1; i++){
            int sum = 0;
           for(int j=0; j<=i; j++){
            sum +=nums[j];
           }
           n[i] = sum;
        }
        
        return n;
    }
}