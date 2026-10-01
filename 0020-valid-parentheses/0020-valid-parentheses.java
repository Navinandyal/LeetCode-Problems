class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0) return false;

        char[] st=new char[s.length()];
        int head=0;
        for(char c:s.toCharArray()){
            if(c=='(') st[head++]=')';
            else if(c=='{') st[head++]='}';
            else if(c=='[') st[head++]=']';
            else{
                if(head==0 || st[--head]!=c) return false;
            }
        }
        return head==0;
    }
}