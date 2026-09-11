class Solution {
    public int[] scoreValidator(String[] events) {
        int score=0,counter=0;
        for(String s:events){
            if(s.equals("W")){
                counter++;
                if(counter>9)return new int[]{score,counter};
            }
            else if(s.equals("WD"))score++;
            else if(s.equals("NB"))score++;
            else{
                score+=s.charAt(0)-'0';
            }
        }

        return new int[]{score,counter};
    }
}