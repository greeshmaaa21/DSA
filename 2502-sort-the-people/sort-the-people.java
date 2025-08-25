class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n=names.length;
      
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){

        if(heights[j] < heights[j+1]){
            //swap the heights
            int tempH=heights[j];
            heights[j]=heights[j+1];
            heights[j+1]=tempH;


            //swap the names 
            String tempN=names[j];
            names[j]=names[j+1];
            names[j+1]=tempN;

        }
    }
}
            return names;
        
    }

}