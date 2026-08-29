class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> merged =new ArrayList<>();
        if(intervals.length<1)return new int[][] {newInterval};
        int[] prev=intervals[0];

        if(newInterval[1]<prev[0]){
            merged.add(newInterval);
            for(int[] temp:intervals)
                merged.add(temp);
            return merged.toArray(new int[merged.size()][]);
        }
        for(int i=1;i<intervals.length;i++){
            int[] intetval=intervals[i];
            if(newInterval[0]<=prev[1] && newInterval[1]>=prev[0]){
                prev[0]=Math.min(prev[0],newInterval[0]);
                prev[1]=Math.max(prev[1],newInterval[1]);
            }
            if(intetval[0]<=prev[1]){
                prev[1]=Math.max(prev[1],intetval[1]);
            }else{
                merged.add(prev);
                 if(newInterval[0] > prev[1] && newInterval[1] < intetval[0])
                    merged.add(newInterval);
                prev=intetval;
            }
        }
        if(newInterval[0]<=prev[1] && newInterval[1]>=prev[0]){
            prev[0]=Math.min(prev[0],newInterval[0]);
            prev[1]=Math.max(prev[1],newInterval[1]);
        }
        merged.add(prev);
        if(newInterval[0] > prev[1])
            merged.add(newInterval);

        return merged.toArray(new int[merged.size()][]);
    }
}