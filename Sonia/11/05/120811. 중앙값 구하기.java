//프로그래머스

import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        List arr = new ArrayList<Integer>(); // list 굳이.. 그리고 리스트는 Collections.sort() 임
        Arrays.sort(array);  // 배열의 정렬...
       
        
        answer = array[array.length/2];

        return answer;
    }
}
