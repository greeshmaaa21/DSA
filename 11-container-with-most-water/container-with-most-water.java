class Solution {
    public int maxArea(int[] height) {
        int strt=0;
        int end=height.length-1;
        int maxArea=0;
        while(strt<end){
            int h=Math.min(height[strt],height[end]);
            int w=end-strt;
            int area=h*w;
           maxArea=Math.max(area,maxArea);
            if(height[strt]<height[end]){
                strt++;
            }
                else{
                    end--;
                }
            }
            return maxArea;

        }
        
    }