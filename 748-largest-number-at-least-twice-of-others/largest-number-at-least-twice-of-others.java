class Solution {
    public int dominantIndex(int[] arrs) {
        int first = arrs[0];
        int index = 0;

        for (int i = 1; i <arrs.length ; i++) {
            if(arrs[i]>first){
                first = arrs[i];
                index = i;
            }
        }

        for (int i = 0; i < arrs.length; i++) {
            int mul = arrs[i] * 2;
            if(mul>first && i != index){
                return -1;
            }
        }
        return index;
        
    }
}