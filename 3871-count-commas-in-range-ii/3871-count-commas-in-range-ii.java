class Solution {
    public long countCommas(long n) {
        long commas=1000,res=0;
        while(commas<=n){
            res+=n-commas+1;
            commas*=1000;
        }
        return res;
    }
}