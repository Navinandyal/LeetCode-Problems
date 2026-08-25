class Solution {
    public int missingMultiple(int[] nums, int k) {
        boolean[] freq=new boolean[201];
        for(int n:nums){
            freq[n]=true;
        }
        for(int i=k;i<freq.length;i+=k)
            if(!freq[i])
                return i;
        return k;
    }
}