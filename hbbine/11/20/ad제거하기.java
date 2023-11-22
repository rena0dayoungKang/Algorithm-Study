import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        
        //리스트 설정
        List<String> arr = new ArrayList<>();
        
        //반복문으로 ad찾아내고 아닌거 리스트에 넣기
        for(String str : strArr){
            if(!str.contains("ad")){
                arr.add(str);
            }
        }
        
        //리스트 answer로 바꾸기
        String[] answer = arr.toArray(new String[0]) ;
        
        return answer;
    }
}
