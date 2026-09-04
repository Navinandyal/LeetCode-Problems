class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int ind=-1;
        for(int i=0;i<nums.length;i++){
            int max=getMax(nums,0,i);
            int min=getMin(nums,i,nums.length-1);
            if(max-min<=k)return i;
        }
        return ind;
    }
    int getMax(int[] arr,int start,int end){
        int max=Integer.MIN_VALUE;
        for(int i=start;i<=end;i++)
            max=Math.max(max,arr[i]);
        return max;
    }
    int getMin(int[] arr,int start,int end){
        int min=Integer.MAX_VALUE;
        for(int i=start;i<=end;i++)
            min=Math.min(min,arr[i]);
        return min;
    }
}