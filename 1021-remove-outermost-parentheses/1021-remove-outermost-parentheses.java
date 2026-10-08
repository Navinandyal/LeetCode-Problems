class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int d = 0;

        for(char c:s.toCharArray()){
            if(c=='('){
                if(d>0)ans.append(c);
                d++;
            }else{
                d--;
                if(d>0)ans.append(c);
            }
        }
        return ans.toString();
    }
}