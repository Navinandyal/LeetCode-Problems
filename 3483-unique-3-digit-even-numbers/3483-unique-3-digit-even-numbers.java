class Solution {
    public int totalNumbers(int[] digits) {
        int[] freq=new int[10];
        int count=0;
        for(int n:digits)
            freq[n]++;
        
        for(int i=100;i<1000;i++){
            if(i%2==1)continue;

            int n1=i/100;
            int n2=(i/10)%10;
            int n3=i%10;

            int[] nums=new int[10];
            boolean flag=true;
            nums[n1]++;
            nums[n2]++;
            nums[n3]++;

            for(int d=0;d<10;d++){
                if(nums[d]>freq[d]){
                    flag=false;
                    break;
                }
            }
            if(flag)count++;
        }

        return count;
    }
}