class Solution {
    public int missingNumber(int[] nums) {
        int sum=(nums.length*(nums.length+1))/2,total=0;
        for(int n:nums)
            total+=n;
        return sum-total;
    }
}