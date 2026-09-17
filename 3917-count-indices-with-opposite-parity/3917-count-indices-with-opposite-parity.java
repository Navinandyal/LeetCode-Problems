class Solution {
    public int[] countOppositeParity(int[] nums) {
        int len=nums.length;
        int[] answer=new int[len];
        int even = 0;
        int odd = 0;
        for (int i = len - 1; i >= 0; i--) {
            if (nums[i] % 2 == 0) {
                answer[i] = odd;
                even++;
            } else {
                answer[i] = even;
                odd++;
            }
        }
        return answer;
    }
}