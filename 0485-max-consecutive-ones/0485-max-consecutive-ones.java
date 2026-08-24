class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0,max=0;
        for(int n:nums){
            if(n==1)
                max=Math.max(++count,max);
            else
                count=0;
        }
        return max;
    }
}