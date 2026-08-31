class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        
        int prev=nums[0],len=nums.length,count=1,ind=1;
        for(int i=1;i<len;i++){
            if(prev==nums[i]){
               count++;
            }else{
                count=1;
                prev=nums[i];
            }
            if(count<=k){
                nums[ind++]=nums[i];
            }
        }
        return Arrays.copyOf(nums,ind);
    }
}