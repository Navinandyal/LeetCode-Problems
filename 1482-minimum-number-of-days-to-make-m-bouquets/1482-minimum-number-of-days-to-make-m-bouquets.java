class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int[] nums=getMinMax(bloomDay);
        int start=nums[0],end=nums[1],ans=-1;
        if(m*k>bloomDay.length) return -1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(possible(bloomDay,mid,m,k)){
                ans=mid;
                end=mid-1;
            }else
                start=mid+1;
        }
        return ans;
    }
    int[] getMinMax(int[] nums){
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int n:nums){
            min=Math.min(min,n);
            max=Math.max(max,n);
        }
        return new int[]{min,max};
    }
    boolean possible(int[] nums,int mid,int m,int k){
        int count=0,noBq=0;
        for(int n:nums){
            if(n<=mid){
                count++;
            }else{
                noBq+=count/k;
                count=0;
            }
        }
        noBq+=count/k;
        return noBq>=m;
    }
}