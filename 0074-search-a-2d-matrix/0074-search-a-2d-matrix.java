class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start=0,end=matrix[0].length-1;
        for(int[] nums:matrix){
            if(nums[start] <= target && nums[end] >= target ){
                while(start<=end){
                    int mid=start+(end-start)/2;
                    if(nums[mid]==target)
                        return true;
                    else if(nums[mid] >target)
                        end=mid-1;
                    else
                        start=mid+1;
                }
            }
        }    
        return false;    
    }
}