class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum>9 *num) return "";
        int last=sum/9,rest=sum%9;
        return ("9".repeat(last)+rest+"0".repeat(num)).substring(0,num);
    }
}