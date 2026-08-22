class Solution {
    public boolean checkDivisibility(int n) {
        long sum=0,product=1,N=n; 
        while(n!=0){
            sum+=n%10;
            product*=n%10;
            n/=10;
        }
        return N%(sum+product)==0;
    }
}