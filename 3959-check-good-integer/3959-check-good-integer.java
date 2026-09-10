class Solution {
    public boolean checkGoodInteger(int n) {
        return squareSum(n)-digitSum(n)>=50;
    }
    long digitSum(int n){
        long sum=0,num=n;
        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
    long squareSum(int n){
        long sum=0,num=n;
        while(num!=0){
            sum+=(num%10)*(num%10);
            num/=10;
        }
        return sum;
    }
}