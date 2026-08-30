class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }
    int mergeSort(int arr[],int l,int h){
        int cnt=0;
        if(l>=h)return cnt;
        int m=l+(h-l)/2;
        cnt+=mergeSort(arr,l,m);
        cnt+=mergeSort(arr,m+1,h);
        cnt+=countPairs(arr,l,m,h);
        cnt+=merge(arr,l,m,h);
        return cnt;
    }
    int countPairs(int[] arr,int l,int m,int r){
        int cnt=0,j=m+1;
        for(int i=l;i<=m;i++){
            while(j<=r && arr[i]>2L*arr[j]) j++;
            cnt+=(j-(m+1));
        }
        return cnt;
    }
    int merge(int[] arr,int l,int m,int r){
        int cnt=0;
        List<Integer> temp=new ArrayList<>();
        int left=l,right=m+1;
        while(left<=m && right<=r){
            if(arr[left]<=arr[right]){
                temp.add(arr[left++]);
            }else{   
                temp.add(arr[right++]);
            }
        }
        while(left<=m){
            temp.add(arr[left++]);
        }
        while(right<=r){
            temp.add(arr[right++]);
        }
        for (int i = 0; i < temp.size(); i++) {
            arr[l+i] = temp.get(i);
        }
        return cnt;
    }
}