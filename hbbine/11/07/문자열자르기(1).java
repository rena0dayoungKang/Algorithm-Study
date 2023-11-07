import java.util.*;

class Solution {
    public int[] solution(String my_string) {

        //문자를 ""으로 바꿔서 숫자만 남기기
        my_string = my_string.replaceAll("[a-z]","");
        
        //숫자만 남은거 배열로 만들기
        String[] str = my_string.split("");
        
        //정답배열 선언
        int[] answer = new int[str.length];
        
        //str -> answer
        for(int i = 0; i < str.length; i++){
            answer[i] = Integer.parseInt(str[i]);
        }
        
        //오름차순 정렬
        Arrays.sort(answer);
        
        return answer;
    }
}
