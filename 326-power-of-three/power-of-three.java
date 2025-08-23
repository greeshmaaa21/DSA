class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==1){
            return true;
        }
        while(n%3!=0 || n<1){
            return false;
        }
        return  isPowerOfThree(n/3); 
        
    }
}