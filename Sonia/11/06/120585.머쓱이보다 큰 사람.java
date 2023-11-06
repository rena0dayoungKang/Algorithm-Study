
//프로그래머스
class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        int cnt =0;
        
     
        for(int i : array) {
            if(i>height){
                cnt+=1;
            }
        }
        answer = cnt;
      /*  
        for(int i=0; i<array.length; i++) {
            if(array[i] >height) {
                cnt+=1;
            }
            answer=cnt;
        }
        */
        return answer;
    }
}
