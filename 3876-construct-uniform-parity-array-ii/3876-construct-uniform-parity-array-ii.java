class Solution {
    public boolean uniformArray(int[] nums1) {
        int minNum=Integer.MAX_VALUE;
        for(int n:nums1)
            minNum=Math.min(minNum,n);
        if(minNum%2==1)return true;

        for(int n:nums1){
            if(minNum==n)continue;
            if(n%2==1){
                return false;
            }
        }
        return true;
    }
}