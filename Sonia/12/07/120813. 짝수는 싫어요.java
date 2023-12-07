//프로그래머스
//https://school.programmers.co.kr/learn/courses/30/lessons/120813

class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n/2+n%2];
        int index = 0;
        for(int i=0; i <= n; i++ ){
            if(i % 2 !=0) {
               answer[index] = i;
                index++;
            }
           
        }
        return answer;
    }
}
