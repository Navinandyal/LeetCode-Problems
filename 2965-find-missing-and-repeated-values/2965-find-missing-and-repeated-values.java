class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length,m=grid[0].length;
        int[] freq=new int[(n*n)+1];
        int[] res=new int[2];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                freq[grid[i][j]]++;
            }
        }
        for(int i=1;i<freq.length;i++){
            if(freq[i]==2)
                res[0]=i;
            else if(freq[i]==0)
                res[1]=i;
        }
        return res;
    }
}