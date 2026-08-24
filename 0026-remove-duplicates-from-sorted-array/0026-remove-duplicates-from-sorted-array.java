class Solution {
    public int removeDuplicates(int[] nums) {

        int lastInd=0;
        int[] expectedNums = new int[nums.length];

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                expectedNums[lastInd++]=nums[i];
            }
        }
        expectedNums[lastInd++]=nums[nums.length-1];

        int i=0;
        for(int n:expectedNums){
            nums[i++]=n;
        }
        return lastInd;
    }
}