class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int temp1=Math.max(x1,Math.min(xCenter,x2));
        int temp2=Math.max(y1,Math.min(yCenter,y2));

        int dis1=temp1-xCenter;
        int dis2=temp2-yCenter;
        
        long sqdis1=(dis1*dis1)+(dis2*dis2);
        return sqdis1<=(radius*radius);


    }
}