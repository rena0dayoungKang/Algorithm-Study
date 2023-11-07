import java.util.*;
class Solution {
    public int[] solution(String myString) {
        
        //x를 기준으로 배열 자르기
        String[] str = myString.split("x", -1);
        
        //마지막 값이 x일 경우를 대비하여 조건 설정
        int length = str.length;
        int[] answer = new int [length];
        
        //배열 하나씩 반복하면서 길이세기
        for(int i = 0; i < str.length; i++){
            int len = str[i].length();
             answer[i] = len; 
            }
        
        return answer;
    }
}
