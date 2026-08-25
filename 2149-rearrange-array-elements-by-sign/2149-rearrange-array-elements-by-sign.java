class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos=0,neg=1;
        int[] ans=new int[nums.length];
        for(int n:nums){
            if(n>0){
                ans[pos]=n;
                pos+=2;
            }else{
                ans[neg]=n;
                neg+=2;
            }
        }       
        return ans;
    }
}