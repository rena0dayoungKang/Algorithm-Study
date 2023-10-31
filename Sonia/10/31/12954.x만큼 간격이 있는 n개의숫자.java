//프로그래머스
class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        for(int i=0; i<n; i++){
            answer[i]= x*((long)i+1);
             //int i long으로 형변환 안해줘서 테스트 13,14, 에러남..
        }
        return answer;
    }
}
