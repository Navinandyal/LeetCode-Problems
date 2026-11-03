class Solution {
    public int minMoves(int[] nums) {
        int max=0;
        for(int n:nums)
            max=Math.max(n,max);
        
        int count=0;
        for(int n:nums)
            count+=(max-n);

        return count;
    }
}