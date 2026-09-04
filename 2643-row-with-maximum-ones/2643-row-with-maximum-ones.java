class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int ind=0,maxCnt=0;
        for(int i=0;i<mat.length;i++){
            int cnt=0;
            for(int n:mat[i]){
                if(n==1)cnt++;
            }
            if(cnt>maxCnt){
                maxCnt=cnt;
                ind=i;
            }
        }
        return new int[]{ind,maxCnt};
    }
}