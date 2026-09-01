class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1,high=getMax(piles);
        while(low<=high){
            int mid=(low+high)/2;
            if(getTotalHours(piles,mid)<=h){
                high=mid-1;
            }else
                low=mid+1;
        }
        return low;
    }

    int getMax(int[] nums){
        int max=Integer.MIN_VALUE;
        for(int n:nums)
            max=Math.max(max,n);
        return max;
    }

    long getTotalHours(int[] arr,int h){
        long totalHours=0;
        for(int n:arr)
            totalHours+=(n+h-1)/h;
        return totalHours;
    }
}