class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max=0;

        while(left<right)
        {
            int w=right-left;
            int heightinChart=Math.min(height[left],height[right]);
            max=Math.max(max,heightinChart*w);

            if(height[left]<height[right])
            {
                left++;
            }
            else{
                right--;
            }
            
        }
        return max;
    }
}
