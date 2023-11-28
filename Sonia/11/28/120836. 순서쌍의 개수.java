//프로그래머스


class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<n+1; i++) {
            if(n%i == 0){
                answer++;
            }
        }
        
        return answer;
    }
}
