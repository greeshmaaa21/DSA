class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1){
            return true;
        }
        while(n<1 || n%4!=0){
            return false;
        }
        return isPowerOfFour(n/4);
    }
}