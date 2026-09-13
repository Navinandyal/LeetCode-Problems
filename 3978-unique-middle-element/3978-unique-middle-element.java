class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int len=nums.length;
        int cnt=0;
        for(int n:nums)
            if(n==nums[len/2])cnt++;
        
        return cnt==1;
    }
}