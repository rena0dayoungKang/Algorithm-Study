//프로그래머스

import java.util.*;
import java.io.*;
class Solution {
    public int solution(int[] numbers) {
        
        int answer = 0;
    
        
        Arrays.sort(numbers); // 오름차순 정렬 
        answer = numbers[numbers.length-1]*numbers[numbers.length-2];
        
      
        /*Arrays.sort(numbers, Collections.reverseOrder()); 
        Integer 객체 반환됨 사용 불가
        ( error: no suitable method found for sort(int[],Comparator<Object>))
        answer = numbers[0] * numbers[1];
        */
        
        return answer;
    }
}
