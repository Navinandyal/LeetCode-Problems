class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        String start = arriveAlice.compareTo(arriveBob)>=0 ? arriveAlice:arriveBob;

        String end = leaveAlice.compareTo(leaveBob)>=0 ? leaveBob : leaveAlice;

        if(start.compareTo(end)>0){
            return 0;
        }

        int total=0;
        int startMonth=Integer.parseInt(start.substring(0,2));
        int startDate=Integer.parseInt(start.substring(3));
        int endMonth=Integer.parseInt(end.substring(0,2));
        int endDate=Integer.parseInt(end.substring(3));

        if(startMonth == endMonth){
            return endDate-startDate +1;
        }

        int[] month={31,28,31,30,31,30,31,31,30,31,30,31};

        for(int i= startMonth; i<endMonth-1;i++){
            total += month[i];
        }

        return total+month[startMonth-1]-startDate+1+endDate;
    }
}