import java.util.*;

class Solution {
    public String[] solution(String myString) {

        //x기준으로 잘라내기
        String[] str = myString.split("x",-1);
        
        //빈문자열 제외해서 리스트에 넣기
        List <String> list = new ArrayList<>();
        for(String s : str){
            if(!s.isEmpty()){
                list.add(s);
            }
        }

        // 리스트를 배열로 변환
        String[] answer = list.toArray(new String[0]);

        // 배열을 사전순으로 정렬
        Arrays.sort(answer);       
        
        return answer;
    }
}
