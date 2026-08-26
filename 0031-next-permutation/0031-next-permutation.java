class Solution {
    public void nextPermutation(int[] nums) {
        int ind=-1,len=nums.length;
        for(int i=len-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }
        if(ind==-1){
            revserse(nums,0,len-1);
        }else{
            for(int i=len-1;i>=0;i--){
                if(nums[i]>nums[ind]){
                     int temp=nums[ind];
                    nums[ind]=nums[i];
                    nums[i]=temp;
                    break;
                }
            }
            revserse(nums,ind+1,len-1);
        }
    }
    void revserse(int nums[],int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start++]=nums[end];
            nums[end--]=temp;
        }
    }
}