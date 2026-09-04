class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length,m=mat[0].length;
        int start=0,end=m-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            int rowInd=findMaxInd(mat,mid);
            int left=mid-1>=0?mat[rowInd][mid-1]:-1;
            int right=mid+1<m?mat[rowInd][mid+1]:-1;
            if(mat[rowInd][mid]>left && mat[rowInd][mid]>right)
                return new int[]{rowInd,mid};
            else if(mat[rowInd][mid]<left)
                end=mid-1;
            else
                start=mid+1;
        }    

        return new int[]{-1,-1};
    }
    int findMaxInd(int[][] mat,int col){
        int maxValue=-1,ind=-1;
        for(int i=0;i<mat.length;i++)
            if(mat[i][col]>maxValue){
                maxValue=mat[i][col];
                ind=i;
            }
        return ind;
    }
}