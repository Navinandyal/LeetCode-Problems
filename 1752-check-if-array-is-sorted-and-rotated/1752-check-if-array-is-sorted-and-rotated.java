class Solution {
    public boolean check(int[] nums) {
        boolean flag=false;
        for (int i=0;i<nums.length;i++) {
            if (nums[i]>nums[(i+1)%nums.length]) {
                if(flag)return false;
                flag=true;
            }
        }
        return true;
    }
}