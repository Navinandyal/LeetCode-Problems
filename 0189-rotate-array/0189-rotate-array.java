class Solution {
    void reverse(int[] arr,int start,int end){
        end--;
        while(start<end){
            int temp=arr[start];
            arr[start++]=arr[end];
            arr[end--]=temp;
        }
    }

    public void rotate(int[] nums, int k) {
        int len=nums.length;
        k%=len;
        if(k==0)return;
        reverse(nums,0,len);
        reverse(nums,0,k);
        reverse(nums,k,len);
    }
}