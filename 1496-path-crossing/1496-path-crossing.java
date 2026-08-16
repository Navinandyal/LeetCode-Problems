class Solution {
    public boolean isPathCrossing(String path) {
        int x=0,y=0;

        Set coordinates=new HashSet<String>();
        coordinates.add(x+" "+y);
        for(char c:path.toCharArray()){
            if(c=='N')
                y++;
            else if(c=='S')
                y--;
            else if(c=='E')
                x++;
            else
                x--;

            if(!coordinates.add(x+" "+y))
                return true;
        }
        return false;

    }
}