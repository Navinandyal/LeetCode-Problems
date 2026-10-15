class Solution {
    public int sumCounts(List<Integer> nums) {
        int res=0,len=nums.size();
        for(int i=0;i<len;i++){
            Set<Integer> s = new HashSet<>();
            for(int j=i;j<len;j++){
                s.add(nums.get(j));
                int d=s.size();
                res+=d*d;
            }
        }

        return res;
    }
}