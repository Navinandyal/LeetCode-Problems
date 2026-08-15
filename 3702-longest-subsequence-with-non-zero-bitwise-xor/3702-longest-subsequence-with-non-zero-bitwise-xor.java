class Solution {
    public int longestSubsequence(int[] nums) {
        int len=nums.length;

        int[] zeros=new int[len];

        if(Arrays.equals(nums,zeros))
            return 0;
        int s=0;
        for(int n:nums)
            s^=n;

        return s!=0?len:len-1;
    }
}