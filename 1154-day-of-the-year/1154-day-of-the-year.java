class Solution {
    public int dayOfYear(String date) {
        String[] dates=date.split("\\-");
        int days=0;
        int[] daysInMonth={31,28,31,30,31,30,31,31,30,31,30,31};
        boolean flag=false;
        if(Integer.parseInt(dates[0])%4==0 && Integer.parseInt(dates[0])%100!=0 || Integer.parseInt(dates[0])%400==0)
            flag=true;
        for(int i=0;i<Integer.parseInt(dates[1])-1;i++){
            if(i==1 && flag==true)
                days+=29;
            else
                days+=daysInMonth[i];
        }
        return days+Integer.parseInt(dates[2]);
    }
}