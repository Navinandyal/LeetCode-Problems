class Solution {
    public int minMoves(int[] nums) {
        int minNum=nums[0],moves=0;
        for(int n:nums){
            minNum=Math.min(minNum,n);
        }
        for(int n:nums){
            moves+=(n-minNum);
        }
        return moves;
    }
}