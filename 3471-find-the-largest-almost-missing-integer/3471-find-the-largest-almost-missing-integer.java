class Solution {
    public int largestInteger(int[] nums, int k) {
        int[] freq=new int[51];

        for(int n:nums)
            freq[n]++;
        
        int res=-1,len=nums.length;
        for(int i=0;i<len;i++)
            if(k==len || (freq[nums[i]]==1 && (k==1 || i==0 || i==len-1)))
                res=Math.max(res,nums[i]);

        return res;

    }
}