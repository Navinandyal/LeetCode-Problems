class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int start=getMax(weights),end=getSum(weights);
        while(start<=end){
            int mid=start+(end-start)/2;
            if(getDays(weights,mid)<=days){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return start;
    }

    int getDays(int[] weights,int d){
        int days=1,sum=0;
        for(int n:weights){
            if(sum+n>d){
                days++;
                sum=n;
            }else{
                sum+=n;
            }
        }
        return days;
    }
    
    int getMax(int[] weights){
        int max=Integer.MIN_VALUE;
        for(int n:weights)
            max=Math.max(n,max);
        return max;
    }
    
    int getSum(int[] weights){
        int sum=0;
        for(int n:weights){
            sum+=n;
        }
        return sum;
    }
}