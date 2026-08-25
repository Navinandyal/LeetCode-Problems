class Solution {
    public void sortColors(int[] nums) {
        int lower=0,mid=0,higher=nums.length-1;
        while(mid<=higher){
            if(nums[mid]==0){
                int temp=nums[lower];
                nums[lower++]=nums[mid];
                nums[mid++]=temp;
            }else if(nums[mid]==1){
                mid++;
            }else{
                int temp=nums[mid];
                nums[mid]=nums[higher];
                nums[higher--]=temp;
            }
        }
    }
}