class Solution {
    public int minimumDeletions(int[] nums) {
        int minInd=0,maxInd=0,minNum=Integer.MAX_VALUE,maxNum=Integer.MIN_VALUE,len=nums.length;
        for(int i=0;i<len;i++){
            if(nums[i]<minNum){
                minNum=nums[i];
                minInd=i;
            }
            if(nums[i]>maxNum){
                maxNum=nums[i];
                maxInd=i;
            }
        }
        int left=Math.min(minInd,maxInd);
        int right=Math.max(minInd,maxInd);

        return Math.min(Math.min(right+1,len-left),(left+1)+(len-right));
    }
}