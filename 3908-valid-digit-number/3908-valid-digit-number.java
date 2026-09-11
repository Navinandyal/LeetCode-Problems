class Solution {
    public boolean validDigit(int n, int x) {
        int ld=0,num=n;
        boolean flag=false;
        while(num!=0){
            ld=num%10;
            if(ld==x)flag=true;
            num/=10;
        }
        return (flag && ld!=x);
    }
}