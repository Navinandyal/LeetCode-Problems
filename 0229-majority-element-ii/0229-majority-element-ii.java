class Solution {
    public List<Integer> majorityElement(int[] nums) {
         List<Integer> res=new ArrayList<>();
        int el1=Integer.MIN_VALUE,el2=Integer.MIN_VALUE,count1=0,count2=0;
        
        for(int n:nums){
            if(count1==0 && n!=el2){
                count1=1;
                el1=n;
            }else if(count2==0 && n!=el1){
                count2=1;
                el2=n;
            }else if(el1==n)count1++;
            else if(el2==n)count2++;
            else{
                count1--;
                count2--;
            }
        }
        count1=0;count2=0;
        for(int n:nums){
            if(el1==n)count1++;
            if(el2==n)count2++;
        }
        int mini=nums.length/3+1;
        
        if(count1>=mini)
            res.add(el1);
        if(count2>=mini)
            res.add(el2);
        return res;
    }
}