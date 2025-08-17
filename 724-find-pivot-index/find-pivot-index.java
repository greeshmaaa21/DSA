class Solution {
    public int pivotIndex(int[] nums) {
     int ls=0, rs=0, ts=0;
     for(int i=0;i<nums.length;i++){
         ts+=nums[i];
    }

    for(int i=0;i<nums.length;i++){
        rs=ts-nums[i]-ls;
        if(rs==ls){
         return i;
        }
        ls+=nums[i];
    }
    return -1;

    }
}