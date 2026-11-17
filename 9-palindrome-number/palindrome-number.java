class Solution {
    public boolean isPalindrome(int x) {
        int v = x;
        int r = 0;
        while(v>0){
            int d = v%10;
            r = (r*10) + d;
            v /= 10;
        }
        if(x == r){
            return true;
        }
        else{
            return false;
        }
    }
}