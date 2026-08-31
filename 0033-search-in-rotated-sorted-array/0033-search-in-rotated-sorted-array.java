class Solution {
    public int search(int[] nums, int target) {
        int peak=peakElement(nums);
        int firstHalf=binarySearch(nums,target,0,peak);
        if(firstHalf==-1){
            firstHalf=binarySearch(nums,target,peak+1,nums.length-1);
        }
        return firstHalf;
    }
    int binarySearch(int arr[],int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
                return mid;
            else if(target<arr[mid])
                end=mid-1;
            else
                start=mid+1;
        }
        return -1;
    }
    int peakElement(int arr[]){
        int start=0,end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(mid < end && arr[mid] > arr[mid+1])
                return mid;
            if(mid > start && arr[mid] < arr[mid-1])
                return mid-1;
            if(arr[mid]<=arr[start])
                end=mid-1;
            else
                start=mid+1;
        }
        return -1;
    }
}