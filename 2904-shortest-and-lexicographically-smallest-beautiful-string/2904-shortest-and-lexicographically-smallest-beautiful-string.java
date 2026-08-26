class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int count=0,start=0,end=0,i=0,j=0,len=s.length(); 
        String ans="";
        for(;j<len;j++){
            
            if(s.charAt(j)=='1')
                count++;
            while(count>k){
                if(s.charAt(i)=='1')
                    count--;
                i++;
            }
            while(count==k && s.charAt(i)=='0')
                i++;
            if(k==count){
                String str=s.substring(i,j+1);
                if(ans.isEmpty() || str.length()<ans.length() || str.length() == ans.length() && str.compareTo(ans) < 0)
                    ans=str;
            }
        }

        return ans;
    }
}