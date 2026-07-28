class Solution {
    public int maximumWealth(int[][] accounts) {
                    
        int sum = 0;
        for(int i=0; i<=accounts.length-1; i++){
            int r = 0;
            for(int j=0; j<=accounts[i].length-1; j++){
                r =r + accounts[i][j];
            }
            if(r>=sum){
                sum = r;
            }
        }
        return sum;
    }
}