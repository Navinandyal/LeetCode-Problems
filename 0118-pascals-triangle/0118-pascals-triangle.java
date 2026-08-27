class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> prev=new ArrayList<>();
        prev.add(1);
        for(int i=0;i<numRows;i++){
            List<Integer> curt=new ArrayList<>();
            curt.add(1);
            for(int j=1;j<prev.size();j++){
                curt.add(prev.get(j-1)+prev.get(j));
            }
            if(i>0)
                curt.add(1);
            res.add(curt);
            prev=curt;
        }

        return res;
    }
}