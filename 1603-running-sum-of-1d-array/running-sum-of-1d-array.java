class Solution {
    public int[] runningSum(int[] nums) {
        int[] n = new int[nums.length];

        int sum = 0;
        for(int i=0; i<=nums.length-1; i++){
            sum =sum + nums[i];
            n[i] = sum;
        }
        
        return n;
    }
}