class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer,boolean[]> seats=new HashMap<>();
        for(int[] row:reservedSeats) {
            seats.computeIfAbsent(row[0], k -> new boolean[10])[row[1] - 1] = true;
        }
        int res=(n-seats.size())*2;
        for(boolean[] row:seats.values()){
            // boolean grp1=true,grp2=true,grp3=true;
            boolean grp1=!(row[1] || row[2] || row[3] || row[4]);
                // grp1=false;
            boolean grp2=!(row[5] || row[6] || row[7] || row[8]);
                // grp2=false;
            boolean grp3=!(row[3] || row[4] || row[5] || row[6]);
                // grp3=false;
            if(grp1 && grp2)res+=2;
            // else if(grp1 || grp2)res+=1;
            else if(grp1 || grp2 || grp3)res+=1;
        }
        return res;
    }
}