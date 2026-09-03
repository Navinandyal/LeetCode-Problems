class Solution {
    public int splitArray(int[] nums, int k) {
        int start=0,end=0;
        for(int num:nums){
            start=Math.max(start,num);
            end+=num;
        }
        while(start<end){
            int mid=start+(end-start)/2;
            int sum=0,parts=1;
            for(int n:nums){
                if(sum+n > mid){
                    sum=n;
                    parts++;
                }else
                    sum+=n;
            }
            if(parts>k)
                start=mid+1;
            else
                end=mid;
        }
        return end;
    }
}