class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> freq=new HashSet<>();
        for(int n:nums)
            freq.add(n);
        int longest=0;
        for(int n:freq){
            if(!freq.contains(n-1)){
                int len=1;
                while(freq.contains(n+len)){
                    len++;
                }
                longest=Math.max(longest,len);
            }
        } 
        return longest;
    }
}