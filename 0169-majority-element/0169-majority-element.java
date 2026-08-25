class Solution {
    public int majorityElement(int[] nums) {
        int digit=0,count=0;
        for(int n:nums){
            if(count==0)
                digit=n;
            if(n==digit)
                count++;
            else
                count--;
        }
        return digit;        
    }
}