import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
    
        List <Integer> list = new ArrayList<>();
        
        //n기준 뒤에꺼
        for(int i = n; i < num_list.length; i++){
            list.add(num_list[i]);
        }
        
        //n기준 앞에꺼
        for(int i = 0; i < n ; i++){
            list.add(num_list[i]);
        }
        
        //answer배열 길이 설정
        int cnt = list.size();
        int[] answer = new int [cnt];
        
        //answer배열에 넣기
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
