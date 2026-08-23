class Solution {
    public boolean sumGame(String num) {
        int leftSum=0,rightSum=0,leftQ=0,rightQ=0;
        for(int i=0;i<num.length();i++){
            if(i<=num.length()/2-1){
                if(num.charAt(i)=='?')
                    leftQ++;
                else
                    leftSum+=num.charAt(i)-'0';
            }else{
                if(num.charAt(i)=='?')
                    rightQ++;
                else
                    rightSum+=num.charAt(i)-'0';
            }
        }
        // return Math.abs(leftSum-rightSum)*2!=Math.abs(rightQ-leftQ)*9;
        return (leftSum-rightSum)*2!=(rightQ-leftQ)*9;
    }
}