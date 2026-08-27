class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        
        List<List<Integer>> res=new ArrayList<>();
        for(int c=0;c<nums.length-2;c++){
            if (c > 0 && nums[c] == nums[c - 1]) continue;
            int a=c+1,b=nums.length-1;
            int target=-nums[c];
            while(a<b){
                if(nums[a]+nums[b]==target){
                    res.add(Arrays.asList(nums[c],nums[a],nums[b]));
                    a++;
                    b--;
                    while (a < b && nums[a] == nums[a - 1]) a++;
                    while (a < b && nums[b] == nums[b + 1]) b--;
                }
                else if(nums[a]+nums[b]>target)
                    b--;
                else
                    a++;
            }
        }
        return res;
    }
}