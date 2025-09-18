class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
        if(hmap.containsKey(nums[i])){
            return true;
        }
        else{
            hmap.put(nums[i],i);
        }
        }
        return false;
    }
}