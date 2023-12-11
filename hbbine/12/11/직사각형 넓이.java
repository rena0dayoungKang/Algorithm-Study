class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        //x, y 값 따로 계산하기
        int maxX = Integer.MIN_VALUE;
        int minX = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;
        
        for(int i = 0; i < dots.length; i++){
            maxX = Math.max(maxX, dots[i][0]);
            minX = Math.min(minX, dots[i][0]);
            maxY = Math.max(maxY,dots[i][1]);
            minY = Math.min(minY,dots[i][1]);
        }   
        int garo = maxX - minX;
        int sero = maxY - minY;
        answer = Math.abs(garo * sero); 
        
        return answer;
    }
}
