class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int len=nums.length,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        int[] prefMax=new int[len];
        int[] suffMin=new int[len];
        prefMax[0]=nums[0];
        suffMin[len-1]=nums[len-1];
        for(int i=0;i<len;i++){
            max=Math.max(max,nums[i]);
            prefMax[i]=max;
            min=Math.min(min,nums[len-1-i]);
            suffMin[len-1-i]=min;
        }

        for(int i=0;i<nums.length;i++){
            if(prefMax[i]-suffMin[i]<=k)return i;
        }
        return -1;
    }
}