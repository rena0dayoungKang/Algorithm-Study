//프로그래머스
class Solution {
    public int solution(int n) {
        int answer = 0;
        int r = n%7;
        if (r==0) { 
        return n/7;
       }else if(r!=0) {
       if(n<7) {
        return 1;
       } else{
        return n/7+1;
       }
    }
        return answer;
    }
}
