class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int start=1,end=getMax(nums),ans=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(calculate(nums,mid)<=threshold){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return start;
    }

    int calculate(int[] nums,int m){
        int count=0;
        for(int n:nums)
            count+=((n+m-1)/m);
        return count;
    }
    int getMax(int[] nums){
        int max=Integer.MIN_VALUE;
        for(int n:nums)
            max=Math.max(max,n);
        return max;
    }
}