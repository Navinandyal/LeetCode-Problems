class Solution {
    public int maxProduct(int[] nums) {
         int minProd=nums[0],maxProd=nums[0],result=nums[0];    
        for(int i=1;i<nums.length;i++){
            int n=nums[i];
            int tempMax=Math.max(n,Math.max(maxProd*n,minProd*n));
            minProd=Math.min(n,Math.min(maxProd*n,minProd*n));
            maxProd=tempMax;
            result=Math.max(maxProd,result);
        }
        return result;
    }
}