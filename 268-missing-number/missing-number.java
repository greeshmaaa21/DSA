class Solution {
    public int missingNumber(int[] nums) {
        int currSum=0;
        int n=nums.length;
        int actualSum=n*(n+1)/2;
        for(int i=0;i<nums.length;i++){
            currSum+=nums[i];
        }
        return actualSum-currSum;
  
}
}