class Solution {
    public int findNumbers(int[] nums) {
        int result=0;
        for(int i=0; i<=nums.length-1; i++){
            int d = nums[i];
            int c = 0;

            while(d>0){
                d /=10;
                c++; 
            }
            if(c%2==0){
                result++;
            }
            
        }
        return result;
    }
}